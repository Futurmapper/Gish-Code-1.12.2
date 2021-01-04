package i.gishreloaded.gishcode.hack.hacks;

import org.lwjgl.input.Keyboard;

import i.gishreloaded.gishcode.hack.Hack;
import i.gishreloaded.gishcode.hack.HackCategory;

import i.gishreloaded.gishcode.utils.Utils;
import i.gishreloaded.gishcode.value.Mode;
import i.gishreloaded.gishcode.value.types.BooleanValue;
import i.gishreloaded.gishcode.value.types.ModeValue;
import i.gishreloaded.gishcode.wrappers.Wrapper;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client	.CPacketPlayer;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class AirJump extends Hack {
	public AirJump() {
		super("AirJump", HackCategory.MOVEMENT);
	}
	
	@Override
	public String getDescription() {
		return "Allows you to you fly";
	}
	
	@Override
	public void onEnable() {
		super.onEnable();
	}
	public void onClientTick(ClientTickEvent event) 
	{
		if(Wrapper.INSTANCE.mcSettings().keyBindJump.isPressed())
			Wrapper.INSTANCE.player().jump();
	}
	
}
