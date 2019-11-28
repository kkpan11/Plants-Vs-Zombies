package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Sun extends GameElements{
    private int x;
    private int y;

    public Sun(int x, int y, Pane pane)
    {
        super(x, y, "file:src/sample/assets/sun.png", pane, 50, 50);
        this.img.setOnMouseClicked(e->{
            System.out.println("Falling sun clicked");
            this.img.setVisible(false);
            this.img.setDisable(true);

        });
    }

//    public void dropSun()
//    { Thread t = new Thread(() -> {
//       while(getY()<=550)
//       {
//           try
//           {
//               Thread.sleep(20);
//               setY(getY()+1);
//           }
//           catch(InterruptedException e)
//           {
//               e.printStackTrace();
//           }
//       }
//    });
//    t.start();
//    }

    public void dropSun()
    {

        Timeline sunDropper = new Timeline(new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    setY(getY()+100);
            }
        }));
        sunDropper.setCycleCount(1);
        sunDropper.play();
    }

    public void updateCount()
    {

    }
}
