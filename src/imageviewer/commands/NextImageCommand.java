package imageviewer.commands;

import imageviewer.ui.ImageViewer;
import java.awt.event.ActionEvent;

public class NextImageCommand implements Command {

    private final ImageViewer viewer;

    public NextImageCommand(ImageViewer viewer) {
        this.viewer = viewer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        execute();
    }

    @Override
    public void execute() {
        this.viewer.setImage(this.viewer.getImage().getNext());
    }

}
