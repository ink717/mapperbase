package tv.mapper.mapperbase.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import tv.mapper.mapperbase.data.BaseTags;
import tv.mapper.mapperbase.item.BaseItems;

public class BaseItemTags extends ItemTagsProvider
{

    public BaseItemTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(BaseTags.ForgeBlocks.STORAGE_BLOCKS_STEEL, BaseTags.ForgeItems.STORAGE_BLOCKS_STEEL);

        getBuilder(BaseTags.ForgeItems.INGOTS_STEEL).add(BaseItems.STEEL_INGOT);
        getBuilder(BaseTags.ForgeItems.NUGGETS_STEEL).add(BaseItems.STEEL_NUGGET);
        getBuilder(BaseTags.ForgeItems.PLATES_STEEL).add(BaseItems.STEEL_PLATE);
        getBuilder(BaseTags.ForgeItems.RODS_STEEL).add(BaseItems.STEEL_ROD);

        getBuilder(BaseTags.ForgeItems.PLATES_IRON).add(BaseItems.IRON_PLATE);
        getBuilder(BaseTags.ForgeItems.RODS_IRON).add(BaseItems.IRON_ROD);

        getBuilder(BaseTags.ForgeItems.PLATES).add(BaseItems.IRON_PLATE);
        getBuilder(BaseTags.ForgeItems.PLATES).add(BaseItems.STEEL_PLATE);
    }
}
