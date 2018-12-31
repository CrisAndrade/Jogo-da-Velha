/**
 * game
 */
public class Game {

    int[][] possibilades1 = {{1, 2, 3}, {4, 5 ,6}, {7, 8, 9}};
    int[][] possibilades2 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    int[][] possibilades3 = {{3, 6, 9}, {1, 5, 9}, {3, 5, 7}};

    static int[][] locais1x = new int[3][3];
    static int[][] locais2x = new int[3][3];
    static int[][] locais3x = new int[3][3];

    static int[][] locais1o = new int[3][3];
    static int[][] locais2o = new int[3][3];
    static int[][] locais3o = new int[3][3];

    static int rodadasx = 0;
    static int rodadaso = 0;

    static Integer teste = 0;

    public void jogada(Integer location, int jogador) {

        if(jogador == 1){

            if(location == 1){
                locais1x[0][0] = 1;
                locais2x[0][0] = 1;
                locais3x[1][0] = 1;
            }
    
            if(location == 2){
                locais1x[0][1] = 2;
                locais2x[1][0] = 2;
            }
    
            if(location == 3){
                locais1x[0][2] = 3;
                locais2x[2][0] = 3;
                locais3x[0][0] = 3;
                locais3x[2][0] = 3;
            }
    
            if(location == 4){
                locais1x[1][0] = 4;
                locais2x[0][1] = 4;
            }
    
            if(location == 5){
                locais1x[1][1] = 5;
                locais2x[1][1] = 5;
                locais3x[1][1] = 5;
                locais3x[2][1] = 5;
            }
    
            if(location == 6){
                locais1x[1][2] = 6;
                locais2x[2][1] = 6;
                locais3x[0][1] = 6;
            }
    
            if(location == 7){
                locais1x[2][0] = 7;
                locais2x[0][2] = 7;
                locais3x[2][2] = 7;
            }
    
            if(location == 8){
                locais1x[2][1] = 8;
                locais2x[1][2] = 8;
            }
    
            if(location == 9){
                locais1x[2][2] = 9;
                locais2x[2][2] = 9;
                locais3x[1][2] = 9;
            }
        }
        
        if(jogador == 2){

            if(location == 1){
                locais1o[0][0] = 1;
                locais2o[0][0] = 1;
                locais3o[1][0] = 1;
            }
    
            if(location == 2){
                locais1o[0][1] = 2;
                locais2o[1][0] = 2;
            }
    
            if(location == 3){
                locais1o[0][2] = 3;
                locais2o[2][0] = 3;
                locais3o[0][0] = 3;
                locais3o[2][0] = 3;
            }
    
            if(location == 4){
                locais1o[1][0] = 4;
                locais2o[0][1] = 4;
            }
    
            if(location == 5){
                locais1o[1][1] = 5;
                locais2o[1][1] = 5;
                locais3o[1][1] = 5;
                locais3o[2][1] = 5;
            }
    
            if(location == 6){
                locais1o[1][2] = 6;
                locais2o[2][1] = 6;
                locais3o[0][1] = 6;
            }
    
            if(location == 7){
                locais1o[2][0] = 7;
                locais2o[0][2] = 7;
                locais3o[2][2] = 7;
            }
    
            if(location == 8){
                locais1o[2][1] = 8;
                locais2o[1][2] = 8;
            }
    
            if(location == 9){
                locais1o[2][2] = 9;
                locais2o[2][2] = 9;
                locais3o[1][2] = 9;
            }
        }

        
    }

    public void verify() {

        /**
         * essa parte verifica se o numeros de rodadas foi melhor que 5.
         */
         //...
    

        teste = 0;
    
        //Verifica se jogador 1 é vencedor.

        for (int i = 0; i < locais1x.length; i++) {
            for (int y = 0; y < locais1x.length; y++) {
                if(locais1x[i][y] == possibilades1[i][y]){
                    teste += 1;
                }
                else{
                    teste = 0;
                }
                //System.out.print(locais1x[i][y]);
            }
            if(teste >= 3){
                rodadasx += 1;
                break;
            }
        }
        //System.out.println();


        for (int i = 0; i < locais2x.length; i++) {
            for (int y = 0; y < locais2x.length; y++) {
                if(locais2x[i][y] == possibilades2[i][y]){
                    teste += 1;
                }
                else{
                    teste = 0;
                }
                //System.out.print(locais2x[i][y]);
            }
            //System.out.print(" ");
            if(teste >= 3){
                rodadasx += 1;
                break;
            }
        }
        //System.out.println();


        for (int i = 0; i < locais3x.length; i++) {
            for (int y = 0; y < locais3x.length; y++) {
                if(locais3x[i][y] == possibilades3[i][y]){
                    teste += 1;
                }
                else{
                    teste = 0;
                }
                //System.out.print(locais3x[i][y]);
            }
            //System.out.print(" ");
            if(teste >= 3){
                rodadasx += 1;
                break;
            }
        }
        //System.out.println();
    

        //Verifica se jogador 1 é vencedor.

        for (int i = 0; i < locais1o.length; i++) {
            for (int y = 0; y < locais1o.length; y++) {
                if(locais1o[i][y] == possibilades1[i][y]){
                    teste += 1;
                }
                else{
                    teste = 0;
                }
                //System.out.print(locais1o[i][y]);
            }
            //System.out.print(" ");
            if(teste >= 3){
                rodadaso += 1;
                break;
            }

        }
        //System.out.println();


        for (int i = 0; i < locais2o.length; i++) {
            for (int y = 0; y < locais2o.length; y++) {
                if(locais2o[i][y] == possibilades2[i][y]){
                    teste += 1;
                }
                else{
                    teste = 0;
                }
                //System.out.print(locais2o[i][y]);
            }
            //System.out.print(" ");
            if(teste >= 3){
                rodadaso += 1;
                break;
            }
        }
        //System.out.println();


        for (int i = 0; i < locais3o.length; i++) {
            for (int y = 0; y < locais3o.length; y++) {
                if(locais3o[i][y] == possibilades3[i][y]){
                    teste += 1;
                }
                else{
                    teste = 0;
                }
                //System.out.print(locais3o[i][y]);
            }
            //System.out.print(" ");
            if(teste >= 3){
                rodadaso += 1;
                break;
            }
        }
        //System.out.println();

        
        if(rodadasx >= 1){
            Layout layout = new Layout();
            layout.jogador1Win();
        }else if(rodadaso >= 1){
            Layout layout = new Layout();
            layout.jogador2Win();
        }
    }

}