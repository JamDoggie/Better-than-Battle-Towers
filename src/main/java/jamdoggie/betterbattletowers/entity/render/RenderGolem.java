package jamdoggie.betterbattletowers.entity.render;

import jamdoggie.betterbattletowers.entity.EntityGolem;
import net.minecraft.client.render.entity.MobRenderer;
import net.minecraft.client.render.entity.PlayerRenderer;
import net.minecraft.client.render.model.ModelBiped;
import net.minecraft.core.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class RenderGolem extends MobRenderer<EntityGolem>
{
	public RenderGolem()
	{
		super(new ModelBiped(), 1.0F);
		setRenderPassModel(new ModelBiped());
	}

	protected void func_15310_scalegolem(EntityGolem entitygolem, float f)
	{
		GL11.glScalef(2.0F, 2.0F, 2.0F);
	}

	@Override
	protected void preRenderCallback(EntityGolem entityliving, float f)
	{
		func_15310_scalegolem(entityliving, f);
		super.preRenderCallback(entityliving, f);
	}
}

