package EasyCompressorMod.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class tileEntityLowPressureCompressor extends TileEntity implements IInventory{
	
	private ItemStack[] items;
	private ItemStack slotIron = new ItemStack(Item.ingotIron);
	private ItemStack slotGold = new ItemStack(Item.ingotGold);
	private ItemStack slotDiamond = new ItemStack(Item.diamond);
	
	private ItemStack ironPiece = new ItemStack(EasyCompressorMod.items.items.ironPiece);
	private ItemStack goldPiece = new ItemStack(EasyCompressorMod.items.items.goldPiece);
	private ItemStack diamondPiece = new ItemStack(EasyCompressorMod.items.items.diamondPiece);

	
	public tileEntityLowPressureCompressor(){
		items = new ItemStack[3];
	}
	
	
	@Override
	public int getSizeInventory() {
		return items.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return items[i];
	}

    @Override
    public ItemStack decrStackSize(int slot, int amt) {
            ItemStack stack = getStackInSlot(slot);
            if (stack != null) {
                    if (stack.stackSize <= amt) {
                            setInventorySlotContents(slot, null);
                    } else {
                            stack = stack.splitStack(amt);
                            if (stack.stackSize == 0) {
                                    setInventorySlotContents(slot, null);
                            }
                    }
            }
            return stack;
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		ItemStack item = getStackInSlot(i);
		setInventorySlotContents(i, null);
		return item;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {

		items[i] = itemstack;
		
		if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()){
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInvName() {
		return "Compressor/Low";
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return entityplayer.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}


    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
	    return false;
    }
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		NBTTagList items = new NBTTagList();
		
		for(int i = 0; i < getSizeInventory(); i++){
			ItemStack stack = getStackInSlot(i);
			
			if(stack != null){
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", (byte)i);
				stack.writeToNBT(item);
				items.appendTag(item);
			}
		}
		
		compound.setTag("Items", items);
	
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		
		NBTTagList items = compound.getTagList("Items");
		
		for(int i = 0; i < items.tagCount(); i++){
			NBTTagCompound item = (NBTTagCompound)items.tagAt(i);
			int slot = item.getByte("Slot");
			
			if(slot >= 0 && slot < getSizeInventory()){
				setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(item));
			}
		}
	}
	
	@Override
	public void updateEntity(){
		if(getStackInSlot(0) == slotIron || getStackInSlot(0) == slotGold || getStackInSlot(0) == slotDiamond){
			if(getStackInSlot(2) != null && getStackInSlot(0) != null && getStackInSlot(2).stackSize >= getStackInSlot(0).stackSize ){
				
				if(getStackInSlot(0) == slotIron){
					decrStackSize(0, 1);
					decrStackSize(2, 1);
				setInventorySlotContents(1, ironPiece);
				}else if(getStackInSlot(0) == slotGold){
					decrStackSize(0, 1);
					decrStackSize(2, 1);
					setInventorySlotContents(1, goldPiece);
				}else if(getStackInSlot(0) == slotDiamond){
					decrStackSize(0, 1);
					decrStackSize(2, 1);
					setInventorySlotContents(1, diamondPiece);
				}else{
					return;
				}
			}else{
				return;
			}
		}
	}
}
