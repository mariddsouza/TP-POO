/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAOAdmin;
import model.ModelAdmin;
/**
 *
 * @author mateu
 */
public class ControlAdmin {
DAOAdmin dAOAdmin = new DAOAdmin();

    public boolean validarAdminControl(ModelAdmin modelAdmin) {
        return this.dAOAdmin.validarAdmin(modelAdmin);
    }
    public boolean salvarAdminControl(ModelAdmin modelAdmin){
        return this.dAOAdmin.salvarAdminDAO(modelAdmin);
    }
    public boolean verificaAdminControl(ModelAdmin modelAdmin){
        return this.dAOAdmin.verificaAdmin(modelAdmin);
    }
    
}
