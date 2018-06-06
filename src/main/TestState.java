package main;

import org.lwjgl.glfw.GLFW;

import com.sabrewulf.engine.application.Application;
import com.sabrewulf.engine.entity.Entity;
import com.sabrewulf.engine.entity.component.SpriteComponent;
import com.sabrewulf.engine.entity.component.TransformComponent;
import com.sabrewulf.engine.maths.Vec3;
import com.sabrewulf.engine.maths.Vec4;
import com.sabrewulf.engine.state.AbstractState;

public class TestState extends AbstractState
{
	private Main app;
	private Entity testEntity;
	
	public TestState(Application app)
	{
		super(app);
		this.app = (Main) app;
	}

	@Override
	public void keyAction(int key, int action)
	{	
		if (key == GLFW.GLFW_KEY_ESCAPE && action == GLFW.GLFW_PRESS) {
			app.exit();
		}
	}

	@Override
	public void mouseAction(int button, int action)
	{
		
	}
	
	@Override
	public void init() {
		super.init();
		
		testEntity = new Entity("Test");
		testEntity.addComponent(new TransformComponent());
		testEntity.addComponent(new SpriteComponent(new Vec4(0.0f, 1.0f, 0.0f, 1.0f), 2.0f, 2.0f));
		
		scene.addEntity(testEntity);
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void update() {
		super.update();
		
		if(app.getInputManager().isKeyPressed(GLFW.GLFW_KEY_LEFT))
		{
			testEntity.getTransform().move(new Vec3(0.1f, 0.0f, 0.0f));
		}
		
		if(app.getInputManager().isKeyPressed(GLFW.GLFW_KEY_RIGHT))
		{
			testEntity.getTransform().move(new Vec3(-0.1f, 0.0f, 0.0f));
		}
		
		if(app.getInputManager().isKeyPressed(GLFW.GLFW_KEY_UP))
		{
			testEntity.getTransform().move(new Vec3(0.0f, 0.1f, 0.0f));
		}
		
		if(app.getInputManager().isKeyPressed(GLFW.GLFW_KEY_DOWN))
		{
			testEntity.getTransform().move(new Vec3(0.0f, -0.1f, 0.0f));
		}
	}
	
	@Override
	public void deactivate()
	{
	}

}
