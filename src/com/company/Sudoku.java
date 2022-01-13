package com.company;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionListener;

public class Sudoku {

    private JFrame frame;
    private final Action action = new SwingAction();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Sudoku window = new Sudoku();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Sudoku() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setEnabled(false);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1);
        panel_1.setLayout(new GridLayout(0, 3, 0, 0));


        /////////////////////
        JLabel lblNewLabel = new JLabel("0");
        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel);

        JPopupMenu popupMenu = new JPopupMenu();
        addPopup(lblNewLabel, popupMenu);

        JButton btnNewButton = new JButton("Wyczysc");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("1");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        popupMenu.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("2");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("3");
        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("4");
        btnNewButton_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("5");
        btnNewButton_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("6");
        btnNewButton_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_6);

        JButton btnNewButton_7 = new JButton("7");
        btnNewButton_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_7);

        JButton btnNewButton_8 = new JButton("8");
        btnNewButton_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_8);

        JButton btnNewButton_9 = new JButton("9");
        btnNewButton_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        popupMenu.add(btnNewButton_9);

        JLabel lblNewLabel_1 = new JLabel("0");
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("0");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("0");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("0");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("0");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("0");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("0");
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("0");
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_8);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_1);
        panel_1_1.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_9 = new JLabel("0");
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_9);

        JLabel lblNewLabel_1_1 = new JLabel("0");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_1_1);

        JLabel lblNewLabel_2_1 = new JLabel("0");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_2_1);

        JLabel lblNewLabel_3_1 = new JLabel("0");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_3_1);

        JLabel lblNewLabel_4_1 = new JLabel("0");
        lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_4_1);

        JLabel lblNewLabel_5_1 = new JLabel("0");
        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_5_1);

        JLabel lblNewLabel_6_1 = new JLabel("0");
        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_6_1);

        JLabel lblNewLabel_7_1 = new JLabel("0");
        lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_7_1);

        JLabel lblNewLabel_8_1 = new JLabel("0");
        lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_1.add(lblNewLabel_8_1);

        JPanel panel_1_2 = new JPanel();
        panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_2);
        panel_1_2.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_10 = new JLabel("0");
        lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_10);

        JLabel lblNewLabel_1_2 = new JLabel("0");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_1_2);

        JLabel lblNewLabel_2_2 = new JLabel("0");
        lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_2_2);

        JLabel lblNewLabel_3_2 = new JLabel("0");
        lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_3_2);

        JLabel lblNewLabel_4_2 = new JLabel("0");
        lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_4_2);

        JLabel lblNewLabel_5_2 = new JLabel("0");
        lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_5_2);

        JLabel lblNewLabel_6_2 = new JLabel("0");
        lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_6_2);

        JLabel lblNewLabel_7_2 = new JLabel("0");
        lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_7_2);

        JLabel lblNewLabel_8_2 = new JLabel("0");
        lblNewLabel_8_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_2.add(lblNewLabel_8_2);

        JPanel panel_1_3 = new JPanel();
        panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_3);
        panel_1_3.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_11 = new JLabel("0");
        lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_11);

        JLabel lblNewLabel_1_3 = new JLabel("0");
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_1_3);

        JLabel lblNewLabel_2_3 = new JLabel("0");
        lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_2_3);

        JLabel lblNewLabel_3_3 = new JLabel("0");
        lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_3_3);

        JLabel lblNewLabel_4_3 = new JLabel("0");
        lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_4_3);

        JLabel lblNewLabel_5_3 = new JLabel("0");
        lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_5_3);

        JLabel lblNewLabel_6_3 = new JLabel("0");
        lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_6_3);

        JLabel lblNewLabel_7_3 = new JLabel("0");
        lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_7_3);

        JLabel lblNewLabel_8_3 = new JLabel("0");
        lblNewLabel_8_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_3.add(lblNewLabel_8_3);

        JPanel panel_1_4 = new JPanel();
        panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_4);
        panel_1_4.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_12 = new JLabel("0");
        lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_12);

        JLabel lblNewLabel_1_4 = new JLabel("0");
        lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_1_4);

        JLabel lblNewLabel_2_4 = new JLabel("0");
        lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_2_4);

        JLabel lblNewLabel_3_4 = new JLabel("0");
        lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_3_4);

        JLabel lblNewLabel_4_4 = new JLabel("0");
        lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_4_4);

        JLabel lblNewLabel_5_4 = new JLabel("0");
        lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_5_4);

        JLabel lblNewLabel_6_4 = new JLabel("0");
        lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_6_4);

        JLabel lblNewLabel_7_4 = new JLabel("0");
        lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_7_4);

        JLabel lblNewLabel_8_4 = new JLabel("0");
        lblNewLabel_8_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_4.add(lblNewLabel_8_4);

        JPanel panel_1_5 = new JPanel();
        panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_5);
        panel_1_5.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_13 = new JLabel("0");
        lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_13);

        JLabel lblNewLabel_1_5 = new JLabel("0");
        lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_1_5);

        JLabel lblNewLabel_2_5 = new JLabel("0");
        lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_2_5);

        JLabel lblNewLabel_3_5 = new JLabel("0");
        lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_3_5);

        JLabel lblNewLabel_4_5 = new JLabel("0");
        lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_4_5);

        JLabel lblNewLabel_5_5 = new JLabel("0");
        lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_5_5);

        JLabel lblNewLabel_6_5 = new JLabel("0");
        lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_6_5);

        JLabel lblNewLabel_7_5 = new JLabel("0");
        lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_7_5);

        JLabel lblNewLabel_8_5 = new JLabel("0");
        lblNewLabel_8_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_5.add(lblNewLabel_8_5);

        JPanel panel_1_6 = new JPanel();
        panel_1_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_6);
        panel_1_6.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_14 = new JLabel("0");
        lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_14);

        JLabel lblNewLabel_1_6 = new JLabel("0");
        lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_1_6);

        JLabel lblNewLabel_2_6 = new JLabel("0");
        lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_2_6);

        JLabel lblNewLabel_3_6 = new JLabel("0");
        lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_3_6);

        JLabel lblNewLabel_4_6 = new JLabel("0");
        lblNewLabel_4_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_4_6);

        JLabel lblNewLabel_5_6 = new JLabel("0");
        lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_5_6);

        JLabel lblNewLabel_6_6 = new JLabel("0");
        lblNewLabel_6_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_6_6);

        JLabel lblNewLabel_7_6 = new JLabel("0");
        lblNewLabel_7_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_7_6);

        JLabel lblNewLabel_8_6 = new JLabel("0");
        lblNewLabel_8_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_6.add(lblNewLabel_8_6);

        JPanel panel_1_7 = new JPanel();
        panel_1_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_7);
        panel_1_7.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_15 = new JLabel("0");
        lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_15);

        JLabel lblNewLabel_1_7 = new JLabel("0");
        lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_1_7);

        JLabel lblNewLabel_2_7 = new JLabel("0");
        lblNewLabel_2_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_2_7);

        JLabel lblNewLabel_3_7 = new JLabel("0");
        lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_3_7);

        JLabel lblNewLabel_4_7 = new JLabel("0");
        lblNewLabel_4_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_4_7);

        JLabel lblNewLabel_5_7 = new JLabel("0");
        lblNewLabel_5_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_5_7);

        JLabel lblNewLabel_6_7 = new JLabel("0");
        lblNewLabel_6_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_6_7);

        JLabel lblNewLabel_7_7 = new JLabel("0");
        lblNewLabel_7_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_7_7);

        JLabel lblNewLabel_8_7 = new JLabel("0");
        lblNewLabel_8_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_7.add(lblNewLabel_8_7);

        JPanel panel_1_8 = new JPanel();
        panel_1_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1_8);
        panel_1_8.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel lblNewLabel_16 = new JLabel("0");
        lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_16);

        JLabel lblNewLabel_1_8 = new JLabel("0");
        lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_1_8);

        JLabel lblNewLabel_2_8 = new JLabel("0");
        lblNewLabel_2_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_2_8);

        JLabel lblNewLabel_3_8 = new JLabel("0");
        lblNewLabel_3_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_3_8);

        JLabel lblNewLabel_4_8 = new JLabel("0");
        lblNewLabel_4_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_4_8);

        JLabel lblNewLabel_5_8 = new JLabel("0");
        lblNewLabel_5_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_5_8);

        JLabel lblNewLabel_6_8 = new JLabel("0");
        lblNewLabel_6_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_6_8);

        JLabel lblNewLabel_7_8 = new JLabel("0");
        lblNewLabel_7_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_7_8);

        JLabel lblNewLabel_8_8 = new JLabel("0");
        lblNewLabel_8_8.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1_8.add(lblNewLabel_8_8);
        frame.setBounds(100, 100, 570, 466);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class SwingAction extends AbstractAction {
        public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e) {
        }
    }
    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
}
