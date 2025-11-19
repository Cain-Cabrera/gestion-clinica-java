package main;

import dao.HistorialDAO;
import dao.PacienteDAO;
import java.util.Scanner;
import service.HistorialServiceImpl;
import service.PacienteServiceImpl;

/**
 * @Cain
 */

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacienteServiceImpl pacienteService = new PacienteServiceImpl(new PacienteDAO());
        HistorialServiceImpl historialService = new HistorialServiceImpl(new HistorialDAO());

        AppMenu menu = new AppMenu(pacienteService, historialService, sc);
        menu.iniciar();
    }
}
