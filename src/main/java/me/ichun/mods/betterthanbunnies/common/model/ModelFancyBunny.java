package me.ichun.mods.betterthanbunnies.common.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.util.math.MathHelper;

public class ModelFancyBunny extends ModelBase
{
    //hat
    public ModelRenderer hatRim;
    public ModelRenderer hatTop;

    //bowtie
    public ModelRenderer bowtie5;
    public ModelRenderer bowtie3;
    public ModelRenderer bowtie4;
    public ModelRenderer bowtie1;
    public ModelRenderer bowtie2;

    //monocle
    public ModelRenderer monocle;
    public ModelRenderer monocle2;
    public ModelRenderer monocle3;
    public ModelRenderer monocle4;
    public ModelRenderer monocle5;
    public ModelRenderer monocle6;
    public ModelRenderer monocle7;
    public ModelRenderer monocle8;
    public ModelRenderer monocle1;
    public ModelRenderer monocleChain1;
    public ModelRenderer monocleChain2;
    public ModelRenderer monocleChain3;
    public ModelRenderer monocleChain4;

    //suit
    public ModelRenderer bodyTux;
    public ModelRenderer frontLegRightTux;
    public ModelRenderer bodyTuxTail1;
    public ModelRenderer bodyTuxTail2;
    public ModelRenderer frontLegLeftTux;

    //pipe
    public ModelRenderer pipe4;
    public ModelRenderer pipe2;
    public ModelRenderer pipe3;
    public ModelRenderer pipe;

    public ModelFancyBunny()
    {
        textureHeight = textureWidth = 64;

        hatRim = new ModelRendererScalable( this, 1, 34, 0.7F, 1.05F, 0.7F );
        hatRim.addBox( -4.5F, -0.5F, -4.5F, 9, 1, 9);
        hatRim.setRotationPoint( 0F, 11.5F, -3.68F );

        hatTop = new ModelRendererScalable( this, 1, 47, 0.6F );
        hatTop.addBox( -3.5F, -4.5F, -3.5F, 7, 9, 7);
        hatTop.setRotationPoint( 0F, 8.5F, -3.68F );

        bowtie5 = new ModelRendererScalable( this, 36, 36, 0.75F );
        bowtie5.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        bowtie5.setRotationPoint( 0F, 17F, -3F );

        bowtie3 = new ModelRendererScalable( this, 36, 36, 0.75F );
        bowtie3.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        bowtie3.setRotationPoint( 0.75F, 17F, -3F );

        bowtie4 = new ModelRendererScalable( this, 36, 36, 0.75F );
        bowtie4.addBox( -0.5F, -1.5F, -0.5F, 1, 3, 1);
        bowtie4.setRotationPoint( 1.5F, 17F, -3F );

        bowtie1 = new ModelRendererScalable( this, 36, 36, 0.75F );
        bowtie1.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        bowtie1.setRotationPoint( -0.75F, 17F, -3F );

        bowtie2 = new ModelRendererScalable( this, 36, 36, 0.75F );
        bowtie2.addBox( -0.5F, -1.5F, -0.5F, 1, 3, 1);
        bowtie2.setRotationPoint( -1.5F, 17F, -3F );

        monocle = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle.addBox( -1.5F, -0.5F, -0.5F, 3, 1, 1);
        monocle.setRotationPoint( 1F, 12F, -6.4F );

        monocle2 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle2.addBox( -1.5F, -0.5F, -0.5F, 3, 1, 1);
        monocle2.setRotationPoint( 1F, 14.1F, -6.4F );

        monocle3 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle3.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        monocle3.setRotationPoint( 0.1F, 13.05F, -6.4F );

        monocle4 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle4.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        monocle4.setRotationPoint( 1.9F, 13.05F, -6.4F );

        monocle5 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle5.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        monocle5.setRotationPoint( 0.4F, 12.3F, -6.4F );

        monocle6 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle6.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        monocle6.setRotationPoint( 0.4F, 13.8F, -6.4F );

        monocle7 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle7.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        monocle7.setRotationPoint( 1.6F, 12.3F, -6.4F );

        monocle8 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocle8.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        monocle8.setRotationPoint( 1.6F, 13.8F, -6.4F );

        monocle1 = new ModelRendererScalable( this, 44, 34, 0.3F );
        monocle1.addBox( -3.5F, -4F, 0F, 7, 8, 0);
        monocle1.setRotationPoint( 1F, 13.05F, -6.4F );

        monocleChain1 = new ModelRendererScalable( this, 0, 35, 0.3F );
        monocleChain1.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        monocleChain1.setRotationPoint( 2.25F, 13.6F, -6.3F );
        setRotateAngle(monocleChain1, 0.06167236F, -0.05083169F, 0.8807254F);

        monocleChain2 = new ModelRendererScalable( this, 8, 32, 0.3F );
        monocleChain2.addBox( -0.16666666666F, -0.5F, -0.5F, 7, 1, 1);
        monocleChain2.setRotationPoint( 2.6F, 14F, -6.3F );
        setRotateAngle(monocleChain2, -0.02879648F, -1.540258F, 0.755817F);

        monocleChain3 = new ModelRendererScalable( this, 8, 32, 0.3F );
        monocleChain3.addBox( -0.16666666666F, -0.5F, -0.5F, 7, 1, 1);
        monocleChain3.setRotationPoint( 2.683918F, 15.3712F, -4.846462F );
        setRotateAngle(monocleChain3, 0.01029625F, -1.581712F, 0.7562005F);

        monocleChain4 = new ModelRendererScalable( this, 8, 32, 0.3F );
        monocleChain4.addBox( -0.16666666666F, -0.5F, -0.5F, 7, 1, 1);
        monocleChain4.setRotationPoint( 2.65391F, 16.74345F, -3.391807F );
        setRotateAngle(monocleChain4, 0.1892902F, -1.975307F, 0.2367755F);

        bodyTux = new ModelRendererScalable( this, 32, 49, 1.05F );
        bodyTux.addBox( -3F, -2.02380952381F, -9.7619047619F, 6, 5, 10);
        bodyTux.setRotationPoint( 0F, 19F, 8F );
        setRotateAngle(bodyTux, -0.3490658F, 0F, 0F);

        frontLegRightTux = new ModelRendererScalable( this, 50, 22, 1.05F );
        frontLegRightTux.addBox( -1F, -0.16666666666F, -1F, 2, 7, 2);
        frontLegRightTux.setRotationPoint( -3F, 17F, -0.9999999F );
        setRotateAngle(frontLegRightTux, -0.1919862F, 0F, 0F);

        bodyTuxTail1 = new ModelRendererScalable( this, 28, 53, 1.0F );
        bodyTuxTail1.addBox( -1.5F, 0.5F, -0.5F, 3, 0, 5);
        bodyTuxTail1.setRotationPoint( 1.6F, 17.10369F, 9.222291F );
        setRotateAngle(bodyTuxTail1, -1.108972F, 0.4427959F, -0.4014674F);

        bodyTuxTail2 = new ModelRendererScalable( this, 28, 48, 1.0F );
        bodyTuxTail2.addBox( -1.5F, 0.5F, -0.5F, 3, 0, 5);
        bodyTuxTail2.setRotationPoint( -1.6F, 17.10369F, 9.222291F );
        setRotateAngle(bodyTuxTail2, -1.108938F, -0.442661F, 0.4013657F);

        frontLegLeftTux = new ModelRendererScalable( this, 50, 13, 1.05F );
        frontLegLeftTux.addBox( -1F, -0.16666666666F, -1F, 2, 7, 2);
        frontLegLeftTux.setRotationPoint( 3F, 17F, -0.9999999F );
        setRotateAngle(frontLegLeftTux, -0.1919862F, 0F, 0F);

        pipe4 = new ModelRendererScalable( this, 22, 46, 0.33F );
        pipe4.addBox( -0.5F, -0.5F, -2F, 1, 1, 4);
        pipe4.setRotationPoint( -0.5F, 15.26F, -6.5F );
        setRotateAngle(pipe4, 0.3376844F, 0.382753F, 0.08644022F);

        pipe2 = new ModelRendererScalable( this, 52, 44, 0.33F );
        pipe2.addBox( -0.5F, -0.5F, -1.5F, 1, 1, 3);
        pipe2.setRotationPoint( -0.863904F, 15.73034F, -7.373644F );
        setRotateAngle(pipe2, 0.5745154F, 0.4069837F, 0.09718834F);

        pipe3 = new ModelRendererScalable( this, 52, 44, 0.33F );
        pipe3.addBox( -0.5F, -1F, -1.5F, 1, 2, 3);
        pipe3.setRotationPoint( -1.09568F, 16.31841F, -7.862072F );
        setRotateAngle(pipe3, 0.8184667F, 0.4414835F, 0.119488F);

        pipe = new ModelRendererScalable( this, 41, 42, 0.33F );
        pipe.addBox( -1.5F, -2F, -1.5F, 3, 4, 3);
        pipe.setRotationPoint( -1.326135F, 16.51624F, -8.438918F );
        setRotateAngle(pipe, 0.2318274F, 0.3733464F, 0.08379398F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        EntityRabbit rabbit = (EntityRabbit)entityIn;
        renderHeadParts(true, true, true, false, scale);
        renderBody(rabbit, false, ageInTicks, scale);
        renderHeadParts(true, true, true, true, scale);
        renderBody(rabbit, true, ageInTicks, scale);
    }

    public void renderHeadParts(boolean renderHat, boolean renderMonocle, boolean renderPipe, boolean color, float f5)
    {
        if(!color)
        {
            if(renderHat)
            {
                hatTop.renderWithRotation(f5);
                hatRim.renderWithRotation(f5);
            }
            if(renderMonocle)
            {
                monocle.renderWithRotation(f5);
                monocle2.renderWithRotation(f5);
                monocle3.renderWithRotation(f5);
                monocle4.renderWithRotation(f5);
                monocle5.renderWithRotation(f5);
                monocle6.renderWithRotation(f5);
                monocle7.renderWithRotation(f5);
                monocle8.renderWithRotation(f5);
                monocle1.renderWithRotation(f5);

                monocleChain1.renderWithRotation(f5);
                monocleChain2.renderWithRotation(f5);
                monocleChain3.renderWithRotation(f5);
                monocleChain4.renderWithRotation(f5);
            }
            if(renderPipe)
            {
                pipe4.renderWithRotation(f5);
                pipe2.renderWithRotation(f5);
                pipe3.renderWithRotation(f5);
                pipe.renderWithRotation(f5);
            }
        }
        else if(renderHat)
        {
            hatTop.renderWithRotation(f5);
        }
    }

    public void renderBody(EntityRabbit rabbit, boolean color, float ageInTicks, float f5)
    {
        if(!color)
        {
            float f = ageInTicks - (float)rabbit.ticksExisted;
            float jumpRotation = MathHelper.sin(rabbit.getJumpCompletion(f) * (float)Math.PI);

            frontLegRightTux.rotateAngleX = (jumpRotation * -40.0F - 11.0F) * 0.017453292F;
            frontLegLeftTux.rotateAngleX = (jumpRotation * -40.0F - 11.0F) * 0.017453292F;
            bodyTuxTail1.rotateAngleX = (-1.108972F + jumpRotation * 0.8F);
            bodyTuxTail2.rotateAngleX = (-1.108972F + jumpRotation * 0.8F);

            frontLegRightTux.renderWithRotation(f5);
            frontLegLeftTux.renderWithRotation(f5);
            bodyTuxTail1.renderWithRotation(f5);
            bodyTuxTail2.renderWithRotation(f5);
            bodyTux.renderWithRotation(f5);
        }
        else
        {
            bowtie5.renderWithRotation(f5);
            bowtie3.renderWithRotation(f5);
            bowtie4.renderWithRotation(f5);
            bowtie1.renderWithRotation(f5);
            bowtie2.renderWithRotation(f5);

            bodyTux.renderWithRotation(f5);
        }
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public class ModelRendererScalable extends ModelRenderer
    {
        private float scaleX;
        private float scaleY;
        private float scaleZ;

        public ModelRendererScalable(ModelBase model, int texOffX, int texOffY, float scale)
        {
            this(model, texOffX, texOffY, scale, scale, scale);
        }

        public ModelRendererScalable(ModelBase model, int texOffX, int texOffY, float scaleX, float scaleY, float scaleZ)
        {
            super(model, texOffX, texOffY);
            this.scaleX = scaleX;
            this.scaleY = scaleY;
            this.scaleZ = scaleZ;
        }

        @Override
        public void renderWithRotation(float scale)
        {
            if (!this.isHidden)
            {
                if (this.showModel)
                {
                    if (!this.compiled)
                    {
                        this.compileDisplayList(scale);
                    }

                    GlStateManager.pushMatrix();
                    GlStateManager.translate(this.rotationPointX * scale, this.rotationPointY * scale, this.rotationPointZ * scale);

                    GlStateManager.scale(scaleX, scaleY, scaleZ);

                    if (this.rotateAngleY != 0.0F)
                    {
                        GlStateManager.rotate(this.rotateAngleY * (180F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
                    }

                    if (this.rotateAngleX != 0.0F)
                    {
                        GlStateManager.rotate(this.rotateAngleX * (180F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
                    }

                    if (this.rotateAngleZ != 0.0F)
                    {
                        GlStateManager.rotate(this.rotateAngleZ * (180F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
                    }

                    GlStateManager.callList(this.displayList);
                    GlStateManager.popMatrix();
                }
            }
        }
    }
}