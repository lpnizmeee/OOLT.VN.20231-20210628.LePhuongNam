package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.screen.*;
import hust.soict.hedspi.aims.cart.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MediaStore extends JPanel {
    private Media media;
    public MediaStore(Media media, Cart cart) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel cost = new JLabel(""+media.getCost()+ "$");
        cost.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton btnAddToCart = new JButton("Add to cart");
        btnAddToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.addMedia(media);
            }
        });


        JButton btnPlay = new JButton("Play");
        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(media instanceof Playable) {
                    ((Playable) media).play();
                }
            }
        });


        container.add(btnAddToCart);
        if(media instanceof Playable) {
            container.add(btnPlay);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
