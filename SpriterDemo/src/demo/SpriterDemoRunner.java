package demo;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

import demo.SpriterDemo;

public class SpriterDemoRunner {

	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg =  new LwjglApplicationConfiguration();
		cfg.title = "Spriter - demo";
		cfg.useGL20 = false;
		cfg.width = 1280;
		cfg.height = 720;
		cfg.resizable = false;
		SpriterDemo demo = new SpriterDemo(true);
		new LwjglApplication(demo, cfg);
	}

}
