package io.github.elytra.fruitphone.proxy;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Rendering {

	public static void bindTexture(ResourceLocation resloc) {
		Minecraft.getMinecraft().renderEngine.bindTexture(resloc);
	}
	
	
	
	private static final DummyScreen GUI = new DummyScreen();
	
	
	public static void drawCreativeTabHoveringText(String tabName, int mouseX, int mouseY) {
		GUI.drawCreativeTabHoveringText(tabName, mouseX, mouseY);
	}
	
	public static void drawGradientRect(int left, int top, int right, int bottom, int startColor, int endColor) {
		GUI.drawGradientRect(left, top, right, bottom, startColor, endColor);
	}
	
	public static void drawHorizontalLine(int startX, int endX, int y, int color) {
		GUI.drawHorizontalLine(startX, endX, y, color);
	}
	
	public static void drawHoveringText(List<String> textLines, int x, int y) {
		GUI.drawHoveringText(textLines, x, y);
	}
	
	public static void drawHoveringText(List<String> textLines, int x, int y, FontRenderer font) {
		GUI.drawHoveringText(textLines, x, y, font);
	}
	
	public static void drawVerticalLine(int x, int startY, int endY, int color) {
		GUI.drawVerticalLine(x, startY, endY, color);
	}
	
	public static void renderToolTip(ItemStack stack, int x, int y) {
		GUI.renderToolTip(stack, x, y);
	}
	
	public static void drawBackground(int tint) {
		GUI.drawBackground(tint);
	}
	
	public static void drawCenteredString(FontRenderer fontRendererIn, String text, int x, int y, int color) {
		GUI.drawCenteredString(fontRendererIn, text, x, y, color);
	}
	
	public static void drawDefaultBackground() {
		GUI.drawDefaultBackground();
	}
	
	public static void drawString(FontRenderer fontRendererIn, String text, int x, int y, int color) {
		GUI.drawString(fontRendererIn, text, x, y, color);
	}
	
	public static void drawTexturedModalRect(float xCoord, float yCoord, int minU, int minV, int maxU, int maxV) {
		GUI.drawTexturedModalRect(xCoord, yCoord, minU, minV, maxU, maxV);
	}
	
	public static void drawTexturedModalRect(int x, int y, int textureX, int textureY, int width, int height) {
		GUI.drawTexturedModalRect(x, y, textureX, textureY, width, height);
	}
	
	public static void drawTexturedModalRect(int xCoord, int yCoord, TextureAtlasSprite textureSprite, int widthIn, int heightIn) {
		GUI.drawTexturedModalRect(xCoord, yCoord, textureSprite, widthIn, heightIn);
	}
	
	public static void drawWorldBackground(int tint) {
		GUI.drawWorldBackground(tint);
	}

	
	private Rendering() {}
	
	private static class DummyScreen extends GuiScreen {

		@Override
		public void drawCreativeTabHoveringText(String tabName, int mouseX, int mouseY) {
			super.drawCreativeTabHoveringText(tabName, mouseX, mouseY);
		}
		
		@Override
		public void drawGradientRect(int left, int top, int right, int bottom, int startColor, int endColor) {
			super.drawGradientRect(left, top, right, bottom, startColor, endColor);
		}
		
		@Override
		public void drawHorizontalLine(int startX, int endX, int y, int color) {
			super.drawHorizontalLine(startX, endX, y, color);
		}
		
		@Override
		public void drawHoveringText(List<String> textLines, int x, int y) {
			super.drawHoveringText(textLines, x, y);
		}
		
		@Override
		public void drawHoveringText(List<String> textLines, int x, int y, FontRenderer font) {
			super.drawHoveringText(textLines, x, y, font);
		}
		
		@Override
		public void drawVerticalLine(int x, int startY, int endY, int color) {
			super.drawVerticalLine(x, startY, endY, color);
		}
		
		@Override
		public void renderToolTip(ItemStack stack, int x, int y) {
			super.renderToolTip(stack, x, y);
		}
		
		
	}

}