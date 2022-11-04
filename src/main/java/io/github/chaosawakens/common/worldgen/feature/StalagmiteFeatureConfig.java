package io.github.chaosawakens.common.worldgen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.IFeatureConfig;

/**
 * @author invalid2
 */
public class StalagmiteFeatureConfig implements IFeatureConfig {

	public static final Codec<StalagmiteFeatureConfig> CODEC = RecordCodecBuilder.create(builder -> builder
			.group(BlockState.CODEC.fieldOf("block").forGetter(config -> config.block),
					Codec.intRange(1, 16).fieldOf("chance").forGetter(config -> config.chance),
					Codec.intRange(1, 16).fieldOf("base-radius").forGetter(config -> config.baseRadius),
					Codec.floatRange(0.1f, 10).fieldOf("base-steepness").forGetter(config -> config.baseSteepness),
					Codec.floatRange(0, 10).fieldOf("variation").forGetter(config -> config.variation))
			.apply(builder, StalagmiteFeatureConfig::new));
	
	public final BlockState block;
	public final int chance;
	public final int baseRadius;
	public final float baseSteepness;
	public final float variation;
	
	/**
	 * 
	 */
	public StalagmiteFeatureConfig(BlockState block, int chance, int baseRadius, float baseSteepness, float variation) {
		super();
		this.block = block;
		this.chance = chance;
		this.baseRadius = baseRadius;
		this.baseSteepness = baseSteepness;
		this.variation = variation;
	}
}