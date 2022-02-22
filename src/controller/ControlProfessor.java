/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAOProfessor;
import model.ModelProfessor;
/**
 *
 * @author mateu
 */
public class ControlProfessor {
DAOProfessor dAOProfessor = new DAOProfessor();

    public boolean validarProfControl(ModelProfessor modelProfessor) {
        return this.dAOProfessor.validarProfessor(modelProfessor);
    }
    
}
