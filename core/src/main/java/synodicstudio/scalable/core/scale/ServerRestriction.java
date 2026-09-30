package synodicstudio.scalable.core.scale;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.labymod.api.Laby;
import net.labymod.api.client.network.server.ServerData;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.network.server.ServerJoinEvent;
import synodicstudio.scalable.core.config.ScalableConfiguration;

public final class ServerRestriction {

  private final ScalableConfiguration configuration;
  private final List<String> hosts = new ArrayList<>();
  private String currentHost;
  private String parsedFrom;

  public ServerRestriction(ScalableConfiguration configuration) {
    this.configuration = configuration;
  }

  @Subscribe
  public void onServerJoin(ServerJoinEvent event) {
    this.currentHost = event.serverData().address().getHost().toLowerCase(Locale.ROOT);
  }

  public boolean isAllowed() {
    if (!this.configuration.restrictToServers().get()) {
      return true;
    }

    String host = this.host();
    if (host == null) {
      return false;
    }

    this.parseIfNeeded();
    for (String entry : this.hosts) {
      if (host.equals(entry) || host.endsWith("." + entry)) {
        return true;
      }
    }

    return false;
  }

  private String host() {
    if (this.currentHost != null) {
      return this.currentHost;
    }

    ServerData serverData = Laby.labyAPI().serverController().getCurrentServerData();
    if (serverData == null) {
      return null;
    }

    this.currentHost = serverData.address().getHost().toLowerCase(Locale.ROOT);
    return this.currentHost;
  }

  private void parseIfNeeded() {
    String raw = this.configuration.serverAddresses().get();
    if (raw == null) {
      raw = "";
    }

    if (raw.equals(this.parsedFrom)) {
      return;
    }

    this.parsedFrom = raw;
    this.hosts.clear();
    for (String part : raw.split("[,;\\s]+")) {
      String entry = part.trim().toLowerCase(Locale.ROOT);
      if (!entry.isEmpty()) {
        this.hosts.add(entry);
      }
    }
  }
}
