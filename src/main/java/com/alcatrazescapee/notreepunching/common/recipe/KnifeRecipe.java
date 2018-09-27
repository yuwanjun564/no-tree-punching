/*
 *  Part of the No Tree Punching Mod by alcatrazEscapee
 *  Work under Copyright. Licensed under the GPL-3.0.
 *  See the project LICENSE.md for more information.
 */

package com.alcatrazescapee.notreepunching.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.alcatrazescapee.alcatrazcore.recipe.RecipeMultiOutput;

import static com.alcatrazescapee.notreepunching.ModConstants.MOD_ID;

public class KnifeRecipe extends RecipeMultiOutput
{
    public static final ResourceLocation ID = new ResourceLocation(MOD_ID, "recipe/knife");

    public KnifeRecipe(ItemStack inputStack, ItemStack... outputStacks)
    {
        super(inputStack, outputStacks);
    }

    public KnifeRecipe(String inputOre, int inputAmount, ItemStack... outputStacks)
    {
        super(inputOre, inputAmount, outputStacks);
    }

    @Override
    public ResourceLocation getID()
    {
        return ID;
    }
}
