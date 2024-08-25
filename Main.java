package view;

import controller.DistroController;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        DistroController distroController = new DistroController();

        // Exibe informações sobre a distribuição
        int choice = JOptionPane.showConfirmDialog(null, "Deseja exibir as propriedades da distribuição Linux?", "Exibir Distribuição Linux",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (choice == JOptionPane.YES_OPTION) {
            distroController.exibeDistro();
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
    }
}
