package net.minecraft.world.locator;

import net.minecraft.world.manager.WorldManager;
import net.minecraft.world.mca.model.MCARegion;

public class RegionLocator {
    private final WorldManager wm;

    public RegionLocator(WorldManager wm) {
        this.wm = wm;
    }

    public MCARegion getRegionByBlock(int blockX, int blockZ) {
        int regionX = blockX >> 9;
        int regionZ = blockZ >> 9;
        return wm.loadRegion(regionX, regionZ);
    }

    public MCARegion getRegionByChunk(int chunkX, int chunkZ) {
        int regionX = chunkX >> 5;
        int regionZ = chunkZ >> 5;
        return wm.loadRegion(regionX, regionZ);
    }

    public MCARegion getRegion(int regionX, int regionZ) {
        return wm.loadRegion(regionX, regionZ);
    }
}
