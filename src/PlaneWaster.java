import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PlaneWaster {
    private final List<Consumer<Graphics2D>> commands = new ArrayList<>();

    // --- State and Styling Methods ---

    public PlaneWaster setColor(Color color) {
        commands.add(g -> g.setColor(color));
        return this;
    }

	public PlaneWaster setComposite(AlphaComposite instance) {
		commands.add(g -> g.setComposite(instance));
        return this;
	}

    // --- Drawing & Filling Methods ---

    public PlaneWaster drawLine(int x, int y, int x2, int y2) {
    	commands.add(g -> g.drawLine(x, y, x2, y2));
    	return this;
    }
    
    public PlaneWaster drawRect(int x, int y, int width, int height) {
        commands.add(g -> g.drawRect(x, y, width, height));
        return this;
    }

    public PlaneWaster fillRect(int x, int y, int width, int height) {
        commands.add(g -> g.fillRect(x, y, width, height));
        return this;
    }

    public PlaneWaster drawOval(int x, int y, int width, int height) {
        commands.add(g -> g.drawOval(x, y, width, height));
        return this;
    }

    public PlaneWaster fillOval(int x, int y, int width, int height) {
        commands.add(g -> g.fillOval(x, y, width, height));
        return this;
    }

    public PlaneWaster drawPolygon(int[] array18, int[] array19, int i) {
		commands.add(g -> g.drawPolygon(array18, array19, i));
        return this;
	}
    
	public PlaneWaster fillPolygon(int[] array18, int[] array19, int i) {
		commands.add(g -> g.fillPolygon(array18, array19, i));
        return this;
	}
	
    // --- Custom / Escape-Hatch Method ---

    /**
     * Allows recording any arbitrary Graphics2D operation.
     */
    public PlaneWaster record(Consumer<Graphics2D> action) {
        commands.add(action);
        return this;
    }

    // --- Execution and Management ---

    /**
     * Sequentially executes all recorded graphics calls onto the target Graphics2D context.
     */
    public void render(Graphics2D g) {
        for (Consumer<Graphics2D> command : commands) {
            command.accept(g);
        }
    }

    /**
     * Clears all recorded commands.
     */
    public void clear() {
        commands.clear();
    }

    /**
     * Returns the number of accumulated commands.
     */
    public int size() {
        return commands.size();
    }
}