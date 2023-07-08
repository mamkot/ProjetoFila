import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int idade=Integer.parseInt(JOptionPane.showInputDialog("Informe a idade correspondente:"));
        if (idade<=10){
            JOptionPane.showMessageDialog(null, "Fila para crianças.");
        }
        else{
            if(idade<=18){
                JOptionPane.showMessageDialog(null, "Fila para jovens.");
            }
            else{
                if(idade<=40){
                    JOptionPane.showMessageDialog(null, "Fila para adultos.");
                }
                else{
                    if (idade<=70){
                        JOptionPane.showMessageDialog(null, "Fila para idosos.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Fila prioritária.");
                    }
                }
            }
            
        }
        
    }
    
}
