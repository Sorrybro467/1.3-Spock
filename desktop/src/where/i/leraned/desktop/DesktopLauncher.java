package where.i.leraned.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import where.i.leraned.learning;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=720;
                config.height=480;
                config.backgroundFPS=60;
                config.foregroundFPS=60;
                new LwjglApplication(new learning(), config);
	}
}
