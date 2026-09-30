package synodicstudio.scalable.core.config;

import java.util.LinkedHashMap;
import java.util.Map;
import net.labymod.api.client.gui.screen.widget.widgets.input.SliderWidget.SliderSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.settings.annotation.SettingRequires;
import net.labymod.api.configuration.settings.annotation.SettingSection;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class MobScaleConfiguration extends Config {

  private final ConfigProperty<Boolean> availableSince1122 = new ConfigProperty<>(false);
  private final ConfigProperty<Boolean> availableSince1165 = new ConfigProperty<>(false);
  private final ConfigProperty<Boolean> availableSince1171 = new ConfigProperty<>(false);
  private final ConfigProperty<Boolean> availableSince1194 = new ConfigProperty<>(false);
  private final ConfigProperty<Boolean> availableSince1201 = new ConfigProperty<>(false);
  private final ConfigProperty<Boolean> availableSince1206 = new ConfigProperty<>(false);
  private final ConfigProperty<Boolean> availableSince1214 = new ConfigProperty<>(false);
  private final ConfigProperty<Boolean> availableSince1218 = new ConfigProperty<>(false);

  @SettingSection("vanilla")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> armorStand = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> bat = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> blaze = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> caveSpider = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> chicken = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> cow = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> creeper = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> enderDragon = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> enderman = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> endermite = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> ghast = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> giant = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> guardian = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> horse = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> ironGolem = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> magmaCube = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> mooshroom = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> ocelot = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> pig = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> rabbit = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> sheep = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> silverfish = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> skeleton = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> slime = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> snowGolem = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> spider = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> squid = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> villager = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> witch = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> wither = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> wolf = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> zombiePigman = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> zombie = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_12_2")
  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> elderGuardian = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> evoker = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> vex = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> vindicator = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> illusioner = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> llama = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> donkey = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> mule = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> skeletonHorse = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> zombieHorse = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> husk = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> stray = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> witherSkeleton = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> polarBear = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> shulker = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1122")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> parrot = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_16_5")
  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> drowned = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> phantom = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> turtle = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> cod = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> salmon = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> pufferfish = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> tropicalFish = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> dolphin = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> panda = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> cat = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> fox = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> pillager = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> ravager = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> traderLlama = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> wanderingTrader = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> bee = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> hoglin = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> piglin = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> piglinBrute = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> strider = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1165")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> zoglin = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_17_1")
  @SettingRequires("availableSince1171")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> axolotl = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1171")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> glowSquid = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1171")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> goat = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_19_4")
  @SettingRequires("availableSince1194")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> allay = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1194")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> frog = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1194")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> tadpole = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1194")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> warden = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1194")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> camel = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_20_1")
  @SettingRequires("availableSince1201")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> sniffer = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_20_6")
  @SettingRequires("availableSince1206")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> armadillo = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1206")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> bogged = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingRequires("availableSince1206")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> breeze = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_21_4")
  @SettingRequires("availableSince1214")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> creaking = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SettingSection("v1_21_8")
  @SettingRequires("availableSince1218")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> happyGhast = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  private transient Map<String, ConfigProperty<Integer>> byKey;

  public Map<String, ConfigProperty<Integer>> byKey() {
    if (this.byKey == null) {
      Map<String, ConfigProperty<Integer>> map = new LinkedHashMap<>();
      map.put("armorStand", this.armorStand);
      map.put("bat", this.bat);
      map.put("blaze", this.blaze);
      map.put("caveSpider", this.caveSpider);
      map.put("chicken", this.chicken);
      map.put("cow", this.cow);
      map.put("creeper", this.creeper);
      map.put("enderDragon", this.enderDragon);
      map.put("enderman", this.enderman);
      map.put("endermite", this.endermite);
      map.put("ghast", this.ghast);
      map.put("giant", this.giant);
      map.put("guardian", this.guardian);
      map.put("horse", this.horse);
      map.put("ironGolem", this.ironGolem);
      map.put("magmaCube", this.magmaCube);
      map.put("mooshroom", this.mooshroom);
      map.put("ocelot", this.ocelot);
      map.put("pig", this.pig);
      map.put("rabbit", this.rabbit);
      map.put("sheep", this.sheep);
      map.put("silverfish", this.silverfish);
      map.put("skeleton", this.skeleton);
      map.put("slime", this.slime);
      map.put("snowGolem", this.snowGolem);
      map.put("spider", this.spider);
      map.put("squid", this.squid);
      map.put("villager", this.villager);
      map.put("witch", this.witch);
      map.put("wither", this.wither);
      map.put("wolf", this.wolf);
      map.put("zombiePigman", this.zombiePigman);
      map.put("zombie", this.zombie);
      map.put("elderGuardian", this.elderGuardian);
      map.put("evoker", this.evoker);
      map.put("vex", this.vex);
      map.put("vindicator", this.vindicator);
      map.put("illusioner", this.illusioner);
      map.put("llama", this.llama);
      map.put("donkey", this.donkey);
      map.put("mule", this.mule);
      map.put("skeletonHorse", this.skeletonHorse);
      map.put("zombieHorse", this.zombieHorse);
      map.put("husk", this.husk);
      map.put("stray", this.stray);
      map.put("witherSkeleton", this.witherSkeleton);
      map.put("polarBear", this.polarBear);
      map.put("shulker", this.shulker);
      map.put("parrot", this.parrot);
      map.put("drowned", this.drowned);
      map.put("phantom", this.phantom);
      map.put("turtle", this.turtle);
      map.put("cod", this.cod);
      map.put("salmon", this.salmon);
      map.put("pufferfish", this.pufferfish);
      map.put("tropicalFish", this.tropicalFish);
      map.put("dolphin", this.dolphin);
      map.put("panda", this.panda);
      map.put("cat", this.cat);
      map.put("fox", this.fox);
      map.put("pillager", this.pillager);
      map.put("ravager", this.ravager);
      map.put("traderLlama", this.traderLlama);
      map.put("wanderingTrader", this.wanderingTrader);
      map.put("bee", this.bee);
      map.put("hoglin", this.hoglin);
      map.put("piglin", this.piglin);
      map.put("piglinBrute", this.piglinBrute);
      map.put("strider", this.strider);
      map.put("zoglin", this.zoglin);
      map.put("axolotl", this.axolotl);
      map.put("glowSquid", this.glowSquid);
      map.put("goat", this.goat);
      map.put("allay", this.allay);
      map.put("frog", this.frog);
      map.put("tadpole", this.tadpole);
      map.put("warden", this.warden);
      map.put("camel", this.camel);
      map.put("sniffer", this.sniffer);
      map.put("armadillo", this.armadillo);
      map.put("bogged", this.bogged);
      map.put("breeze", this.breeze);
      map.put("creaking", this.creaking);
      map.put("happyGhast", this.happyGhast);
      this.byKey = map;
    }

    return this.byKey;
  }

  public void applyAvailability(boolean since1122, boolean since1165, boolean since1171, boolean since1194, boolean since1201, boolean since1206, boolean since1214, boolean since1218) {
    this.availableSince1122.set(since1122);
    this.availableSince1165.set(since1165);
    this.availableSince1171.set(since1171);
    this.availableSince1194.set(since1194);
    this.availableSince1201.set(since1201);
    this.availableSince1206.set(since1206);
    this.availableSince1214.set(since1214);
    this.availableSince1218.set(since1218);
  }

  public void resetAll() {
    for (ConfigProperty<Integer> property : this.byKey().values()) {
      property.set(ScaleRange.DEFAULT_PERCENT);
    }
  }
}
