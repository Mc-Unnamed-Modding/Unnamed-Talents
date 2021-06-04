package com.unnamedmods.unnamedtalents.player.playercapability;

import com.unnamedmods.unnamedtalents.UnnamedTalents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = UnnamedTalents.MOD_ID)
public class CapabilityHandler
{

    @SubscribeEvent
    public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event)
    {
        if (event.getObject() instanceof PlayerEntity)
        {
            //noinspection SpellCheckingInspection
            event.addCapability(new ResourceLocation(UnnamedTalents.MOD_ID, "playercap"), new PlayerCapProvider());
        }
    }

    @SuppressWarnings("all")
    // Testing Event (Remove Later)
    @SubscribeEvent
    public static void onEntityHit (AttackEntityEvent event)
    {
        if (event.getPlayer() != null && !event.getPlayer().getCommandSenderWorld().isClientSide)
        {
            // .filter for conditional lambdas
            event.getPlayer().getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                    .filter(iPlayerCap -> !iPlayerCap.isAdrenalineUnlocked())
                    .ifPresent(iPlayerCap ->
                    {
                        iPlayerCap.setAttackXP(iPlayerCap.getAttackXP() + 1);
                        iPlayerCap.setCombatXP(Math.floorDiv(iPlayerCap.getAttackXP(), 3));
                    });

            event.getPlayer().getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                    .ifPresent(iPlayerCap ->
                    {
                        System.out.println(iPlayerCap.getAttackXP());
                        System.out.println(iPlayerCap.getCombatXP());
                    });
        }
    }

    // Testing Event (Remove Later)
    @SubscribeEvent
    public static void onPlayerTick (LivingDeathEvent event)
    {
        if (event.getEntityLiving() instanceof PlayerEntity)
            {
                PlayerEntity entity = (PlayerEntity) event.getEntityLiving();

                entity.getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                        .filter(iPlayerCap -> !iPlayerCap.isAdrenalineUnlocked())
                        .ifPresent(iPlayerCap ->
                        {
                            event.setCanceled(true);
                            entity.setHealth(1);

                        });
            }
    }

    @SuppressWarnings("all")
    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event)
    {
        if (event.isWasDeath())
        {
            if (event.getOriginal() instanceof ServerPlayerEntity)
            {
                PlayerEntity player = event.getOriginal();
                ServerPlayerEntity newPlayer = (ServerPlayerEntity) event.getPlayer();

                IPlayerCap originalPlayerCapability = player.getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                .orElseThrow(() -> new IllegalArgumentException("At clone event"));

                newPlayer.getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                .ifPresent((IPlayerCap newCap) -> {
                    newCap.setCombatLevel(originalPlayerCapability.getCombatLevel());
                    newCap.setAttackLevel(originalPlayerCapability.getAttackLevel());
                    newCap.setPersistenceUnlocked(originalPlayerCapability.isPersistenceUnlocked());
                    newCap.setIntuitionUnlocked(originalPlayerCapability.isIntuitionUnlocked());
                    newCap.setDefenseLevel(originalPlayerCapability.getDefenseLevel());
                    newCap.setAdrenalineUnlocked(originalPlayerCapability.isAdrenalineUnlocked());
                    newCap.setUndyingUnlocked(originalPlayerCapability.isUndyingUnlocked());
                    newCap.setArcheryLevel(originalPlayerCapability.getArcheryLevel());
                    newCap.setLuckyShotUnlocked(originalPlayerCapability.isLuckyShotUnlocked());
                    newCap.setEagleEyeUnlocked(originalPlayerCapability.isEagleEyeUnlocked());
                    newCap.setSurvivalLevel(originalPlayerCapability.getSurvivalLevel());
                    newCap.setSmeltingLevel(originalPlayerCapability.getSmeltingLevel());
                    newCap.setEfficiencyUnlocked(originalPlayerCapability.isEfficiencyUnlocked());
                    newCap.setChefUnlocked(originalPlayerCapability.isChefUnlocked());
                    newCap.setForagingLevel(originalPlayerCapability.getForagingLevel());
                    newCap.setSatedUnlocked(originalPlayerCapability.isSatedUnlocked());
                    newCap.setHealthyLivingUnlocked(originalPlayerCapability.isHealthyLivingUnlocked());
                    newCap.setFarmingLevel(originalPlayerCapability.getFarmingLevel());
                    newCap.setNatureUnlocked(originalPlayerCapability.isNatureUnlocked());
                    newCap.setFarmerUnlocked(originalPlayerCapability.isFarmerUnlocked());
                    newCap.setMagicLevel(originalPlayerCapability.getMagicLevel());
                    newCap.setAlchemyLevel(originalPlayerCapability.getAlchemyLevel());
                    newCap.setAlchemistUnlocked(originalPlayerCapability.isAlchemistUnlocked());
                    newCap.setProjectPotionUnlocked(originalPlayerCapability.isProjectPotionUnlocked());
                    newCap.setAgilityLevel(originalPlayerCapability.getAgilityLevel());
                    newCap.setQuickStepUnlocked(originalPlayerCapability.isQuickStepUnlocked());
                    newCap.setPhantomShiftUnlocked(originalPlayerCapability.isPhantomShiftUnlocked());
                    newCap.setEnchantingLevel(originalPlayerCapability.getEnchantingLevel());
                    newCap.setSpecialistUnlocked(originalPlayerCapability.isSpecialistUnlocked());
                    newCap.setEnchanterUnlocked(originalPlayerCapability.isEnchanterUnlocked());
                    newCap.setLaborLevel(originalPlayerCapability.getLaborLevel());
                    newCap.setMiningLevel(originalPlayerCapability.getMiningLevel());
                    newCap.setDemolistUnlocked(originalPlayerCapability.isDemolistUnlocked());
                    newCap.setMinerUnlocked(originalPlayerCapability.isMinerUnlocked());
                    newCap.setExcavationLevel(originalPlayerCapability.getExcavationLevel());
                    newCap.setBulldozerUnlocked(originalPlayerCapability.isBulldozerUnlocked());
                    newCap.setExcavatorUnlocked(originalPlayerCapability.isExcavatorUnlocked());
                    newCap.setBuildingLevel(originalPlayerCapability.getBuildingLevel());
                    newCap.setConstructorUnlocked(originalPlayerCapability.isConstructorUnlocked());
                    newCap.setBuilderUnlocked(originalPlayerCapability.isBuilderUnlocked());
                });
            }
        }
    }
}
