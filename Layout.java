import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Layout
 */
public class Layout extends JFrame {
    
    /**
     * Elementos e estrutura somente para a tela do Tabuleiro.
     */
    Game game = new Game();

    JLabel jLabel_tabuleiro = new JLabel("", new ImageIcon("img\\fundo.jpg"), JLabel.CENTER);

    JButton btn_0 = new JButton();
    JButton btn_1 = new JButton();
    JButton btn_2 = new JButton();
    JButton btn_3 = new JButton();
    JButton btn_4 = new JButton();
    JButton btn_5 = new JButton();
    JButton btn_6 = new JButton();
    JButton btn_7 = new JButton();
    JButton btn_8 = new JButton();

    JButton btn_0_clicked = new JButton();
    JButton btn_1_clicked = new JButton();
    JButton btn_2_clicked = new JButton();
    JButton btn_3_clicked = new JButton();
    JButton btn_4_clicked = new JButton();
    JButton btn_5_clicked = new JButton();
    JButton btn_6_clicked = new JButton();
    JButton btn_7_clicked = new JButton();
    JButton btn_8_clicked = new JButton();


    int jogador = 1;
    public void tabuleiro() {


        // configuração da tela do tabuleiro.
        jLabel_tabuleiro.setBounds(0, 0, 750, 390);
        add(jLabel_tabuleiro); 

        // botão 0.
        btn_0.setBounds(20, 20, 100, 100);
        btn_0.addActionListener(new ActionTabuleiro());
        btn_0.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_0.setVisible(true);
        
        // botão 1.
        btn_1.setBounds(120, 20, 100, 100);
        btn_1.addActionListener(new ActionTabuleiro());
        btn_1.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_1.setVisible(true);
        
        // botão 2.
        btn_2.setBounds(220, 20, 100, 100);
        btn_2.addActionListener(new ActionTabuleiro());
        btn_2.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_2.setVisible(true);
        
        // botão 3.
        btn_3.setBounds(20, 120, 100, 100);
        btn_3.addActionListener(new ActionTabuleiro());
        btn_3.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_3.setVisible(true);
        
        // botão 4.
        btn_4.setBounds(120, 120, 100, 100);
        btn_4.addActionListener(new ActionTabuleiro());
        btn_4.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_4.setVisible(true);
        
        // botão 5.
        btn_5.setBounds(220, 120, 100, 100);
        btn_5.addActionListener(new ActionTabuleiro());
        btn_5.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_5.setVisible(true);
        
        // botão 6.
        btn_6.setBounds(20, 220, 100, 100);
        btn_6.addActionListener(new ActionTabuleiro());
        btn_6.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_6.setVisible(true);
        
        // botão 7.
        btn_7.setBounds(120, 220, 100, 100);
        btn_7.addActionListener(new ActionTabuleiro());
        btn_7.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_7.setVisible(true);
        
        // botão 8.
        btn_8.setBounds(220, 220, 100, 100);
        btn_8.addActionListener(new ActionTabuleiro());
        btn_8.setIcon(new ImageIcon("img\\vazio.jpg"));
        btn_8.setVisible(true);
        
        
        // adicionando botões na label do tabuleiro.
        jLabel_tabuleiro.add(btn_8);
        jLabel_tabuleiro.add(btn_7);
        jLabel_tabuleiro.add(btn_6);
        jLabel_tabuleiro.add(btn_5);
        jLabel_tabuleiro.add(btn_4);
        jLabel_tabuleiro.add(btn_3);
        jLabel_tabuleiro.add(btn_2);
        jLabel_tabuleiro.add(btn_1);
        jLabel_tabuleiro.add(btn_0);
        
    }


    public class ActionTabuleiro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == btn_0){
                Integer location = 1;
                game.jogada(location, jogador);
                if(jogador == 1){                    
                    btn_0_clicked.setBounds(20, 20, 100, 100);
                    btn_0_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_0_clicked);
                    jLabel_tabuleiro.remove(btn_0);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_0_clicked.setBounds(20, 20, 100, 100);
                    btn_0_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_0_clicked);
                    jLabel_tabuleiro.remove(btn_0);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_1){
                Integer location = 2;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_1_clicked.setBounds(120, 20, 100, 100);
                    btn_1_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_1_clicked);
                    jLabel_tabuleiro.remove(btn_1);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_1_clicked.setBounds(120, 20, 100, 100);
                    btn_1_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_1_clicked);
                    jLabel_tabuleiro.remove(btn_1);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_2){
                Integer location = 3;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_2_clicked.setBounds(220, 20, 100, 100);
                    btn_2_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_2_clicked);
                    jLabel_tabuleiro.remove(btn_2);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_2_clicked.setBounds(220, 20, 100, 100);
                    btn_2_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_2_clicked);
                    jLabel_tabuleiro.remove(btn_2);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_3){
                Integer location = 4;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_3_clicked.setBounds(20, 120, 100, 100);
                    btn_3_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_3_clicked);
                    jLabel_tabuleiro.remove(btn_3);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_3_clicked.setBounds(20, 120, 100, 100);
                    btn_3_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_3_clicked);
                    jLabel_tabuleiro.remove(btn_3);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_4){
                Integer location = 5;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_4_clicked.setBounds(120, 120, 100, 100);
                    btn_4_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_4_clicked);
                    jLabel_tabuleiro.remove(btn_4);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_4_clicked.setBounds(120, 120, 100, 100);
                    btn_4_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_4_clicked);
                    jLabel_tabuleiro.remove(btn_4);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_5){
                Integer location = 6;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_5_clicked.setBounds(220, 120, 100, 100);
                    btn_5_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_5_clicked);
                    jLabel_tabuleiro.remove(btn_5);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_5_clicked.setBounds(220, 120, 100, 100);
                    btn_5_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_5_clicked);
                    jLabel_tabuleiro.remove(btn_5);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_6){
                Integer location = 7;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_6_clicked.setBounds(20, 220, 100, 100);
                    btn_6_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_6_clicked);
                    jLabel_tabuleiro.remove(btn_6);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_6_clicked.setBounds(20, 220, 100, 100);
                    btn_6_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_6_clicked);
                    jLabel_tabuleiro.remove(btn_6);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_7){
                Integer location = 8;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_7_clicked.setBounds(120, 220, 100, 100);
                    btn_7_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_7_clicked);
                    jLabel_tabuleiro.remove(btn_7);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_7_clicked.setBounds(120, 220, 100, 100);
                    btn_7_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_7_clicked);
                    jLabel_tabuleiro.remove(btn_7);
                    jogador = 1;
                }
                new Game().verify();
            }

            if(e.getSource() == btn_8){
                Integer location = 9;
                new Game().jogada(location, jogador);
                if(jogador == 1){                    
                    btn_8_clicked.setBounds(220, 220, 100, 100);
                    btn_8_clicked.setIcon(new ImageIcon("img\\x.jpg"));
                    jLabel_tabuleiro.add(btn_8_clicked);
                    jLabel_tabuleiro.remove(btn_8);
                    jogador = 2;
                }else if(jogador == 2){
                    btn_8_clicked.setBounds(220, 220, 100, 100);
                    btn_8_clicked.setIcon(new ImageIcon("img\\o.jpg"));
                    jLabel_tabuleiro.add(btn_8_clicked);
                    jLabel_tabuleiro.remove(btn_8);
                    jogador = 1;
                }
                new Game().verify();
            }
        
        }

    }


    /**
     * Elementos e estrutura somente para a tela do menu principal.
     */
    JLabel jLabel_jogador1Win = new JLabel("", new ImageIcon("img\\fundo.jpg"), JLabel.CENTER);
    public void jogador1Win() {
        jLabel_tabuleiro.setVisible(false);
        remove(jLabel_tabuleiro);
        System.out.println("teste1");
        jLabel_jogador1Win.setBounds(0, 0, 750, 390);
        add(jLabel_jogador1Win); 
    }


    /**
     * Elementos e estrutura somente para a tela do menu principal.
     */
    JLabel jLabel_jogador2Win = new JLabel("", new ImageIcon("img\\fundo.jpg"), JLabel.CENTER);
    public void jogador2Win() {
        jLabel_tabuleiro.setVisible(false);
        System.out.println("teste2");
        jLabel_jogador2Win.setBounds(0, 0, 750, 390);
        add(jLabel_jogador1Win); 
    }
    


    /**
     * Elementos e estrutura somente para a tela do menu principal.
     */
    JLabel jLabel_main_menu = new JLabel("", new ImageIcon("img\\fundo.jpg"), JLabel.CENTER);
    JLabel jLabel_titulo = new JLabel("", new ImageIcon("img\\main_menu\\titulo.png"), JLabel.CENTER);
    JButton btn_play = new JButton();

    public void main_menu() {
        setLayout(null);
        setTitle("Jogo da Velha");
        setSize(715, 390);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        jLabel_main_menu.setBounds(0, 0, 750, 390);
        jLabel_main_menu.setVisible(true);
        add(jLabel_main_menu);

        jLabel_titulo.setBounds(0, 20, 700, 100);
        jLabel_titulo.setVisible(true);
        jLabel_main_menu.add(jLabel_titulo);

        btn_play.setBounds(0, 150, 250, 70);
        btn_play.addActionListener(new ActionMainMenu());
        btn_play.setIcon(new ImageIcon("img\\main_menu\\btn_jogar.jpg"));
        btn_play.setVisible(true);

        jLabel_main_menu.add(btn_play);

    }

    public class ActionMainMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == btn_play){
                tabuleiro();
                jLabel_main_menu.setVisible(false);
            }

        }

    }


    /**
     * Função principal a ser chamada assim que iniciar o programa.
     * @param args
     */
    public static void main(String[] args) {

        new Layout().main_menu();

    }

}
