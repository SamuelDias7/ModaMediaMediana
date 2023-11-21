import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class TelaInicial extends JFrame {
    JTextField c1;
    JButton b1,b2;

    JTextArea a1,a2;

    JLabel l1;

    String textoNumero = null;
    int[] numeros;

    int resultado = 0;

    int soma;
    int adicao;
    String salvando;
    int mediana1;

    int mediana2;

    int mediana1save;
    int mediana2save;
    int medianaTotal;
    double medianaV;
    int i;
    int dois;
    int nl;
    int j;
    int check;
    int x;
    int mds;

    String xaS;
    String mdsS;

    //ArrayList numeros = new ArrayList();

    public void iniciar(){
        setTitle("Tela Inicial");
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void construindo(){
        c1 = new JTextField(1);
        b1 = new JButton("Adicionar");
        b2 = new JButton("Somar");
        l1 = new JLabel("Resultados:");
        a1 = new JTextArea();
        a1.setEditable(false);
        a2 = new JTextArea();
        a2.setEditable(false);

    }

    public void adicionar(){
        add(c1);
        add(b1);
        add(b2);
        //add(b3);
        add(a1);
        add(a2);
        add(l1);
    }
    public void localposi(){
        c1.setBounds(30,10,150,30);
        b1.setBounds(200,10,150,30);
        b2.setBounds(250,80,100,100);
        a1.setBounds(30,80,200,100);
        a2.setBounds(30,230,200,100);
        l1.setBounds(30,170,200,100);
    }

    public void acoes(){

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoNumero = c1.getText();
                c1.setText("");
                try{
                    int valor = Integer.parseInt(textoNumero);

                    if(numeros == null){
                        //JOptionPane.showMessageDialog(null, "Novo numero");
                        numeros = new int[]{valor};


                    }else{
                        //JOptionPane.showMessageDialog(null, "Adicionar mais");
                        int[] novoArray = new int[numeros.length + 1];
                        System.arraycopy(numeros,0, novoArray,0,numeros.length);
                        novoArray[numeros.length] = valor;
                        numeros = novoArray;
                       // JOptionPane.showMessageDialog(null, );



                    }
                    a1.setText(Arrays.toString(numeros));

                }catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Insira um numero correto");

                }

            }

        });


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Numero:" + numeros.length);

                if(textoNumero != null){
                    for(int i = 0; i< numeros.length; i++){
                        //JOptionPane.showMessageDialog(null,"Tamanho do array: " + numeros.length);
                        //JOptionPane.showMessageDialog(null, "numero: " + numeros[i]);
                        //JOptionPane.showMessageDialog(null, "Numero:" + numeros[i]);

                        int save = numeros[i];
                        int real = save;
                        resultado += real;



                        //JOptionPane.showMessageDialog(null, "Soma dos numeros:" + resultado);

                    }
                    //JOptionPane.showMessageDialog(null, "Ha " + numeros.length + " Elementos");

                    adicao = resultado;

                    //


                    resultado = resultado / numeros.length;

                    soma = resultado;

                    salvando = String.valueOf(soma);

                   // JOptionPane.showMessageDialog(null, "a media é " + resultado);





                }else {
                    JOptionPane.showMessageDialog(null, "campo vazio");
                }

                if(numeros.length % 2 == 0){
                    mediana1 = numeros.length / 2;

                    //JOptionPane.showMessageDialog(null, "mediana 1: " + mediana1);

                    //mediana1save = mediana1 +1;

                   // JOptionPane.showMessageDialog(null, "A mediana 2 é:" + numeros[mediana1 + 0]);

                    mediana1 = mediana1 + numeros[mediana1 + 0];


                    medianaV = Double.valueOf(mediana1);

                    medianaV = medianaV /2;

                    //JOptionPane.showMessageDialog(null, "Em double: " + medianaV);

                    //JOptionPane.showMessageDialog(null, "A mediana 2 é:" + mediana1);
                    //JOptionPane.showMessageDialog(null, "soma das medianas :" + mediana1);


                    //JOptionPane.showMessageDialog(null, "A mediana geral é: : " + medianaV);

                    //mediana2 =




                }else{
                   mediana1 = numeros.length / 2;

                   mediana1 = mediana1 + 0;

                   medianaV = mediana1 + 1;

                    //JOptionPane.showMessageDialog(null," A;  "+ mediana1);


                    //JOptionPane.showMessageDialog(null, numeros[mediana1]);



                }//
                nl = numeros.length ;

                //Lembre-se: o primeiro número apenas checa 1 número, e assim vai graduando


                // Responsável pela ordem dos numeros selecionados pelo usuario(QUANDO ELA RODA O NUMEROS INFORMADO PELO USUARIO VAI PARA O PROXIMO)
                    for(int x : numeros){

                        i = 0;
                        j++;
                        int JJ = j-1;
                        for(;i < j;i++){

                            int a = 0;
                            //a++;
                            for(;numeros[JJ] == numeros[a];a++){
                                System.out.println("[" +  numeros[JJ] + "      " + numeros[a] + "]");


                            }
                            if(numeros[JJ] != numeros[a]){
                                System.out.println("[Diferente " +  numeros[JJ] + "      " + numeros[a] + "]");
                            }
                        }
                }

                int ul = numeros.length;
               // JOptionPane.showMessageDialog(null, "ultimo numero: " + numeros[ul - 1]);


                a2.setText("Soma: " + adicao + "\nmoda: " + "\nmedia: " + salvando + "\nmediana: " + medianaV );

            }

        });

    }


    TelaInicial(){
        this.iniciar();
        this.construindo();
        this.adicionar();
        this.localposi();
        this.acoes();
    }

    public static void main(String args[]){
        new TelaInicial();
    }



}
