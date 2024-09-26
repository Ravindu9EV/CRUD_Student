//package edu.icet.crm.controller;
//
//import edu.icet.crm.dao.guardian.GuardianDAO;
//import edu.icet.crm.service.GuardianService;
//import edu.icet.crm.service.impl.GuardianServiceImpl;
//import lombok.RequiredArgsConstructor;
//
//@RequiredArgsConstructor
//public class GuardianController {
//
//    private static GuardianController instance;
//    private final GuardianServiceImpl service;
//    private GuardianController(){
//        this.service= new GuardianServiceImpl();
//    }
//    public static GuardianController getInstance(){
//        return instance==null ? instance=new GuardianController() : instance;
//    }
//
//    public void addGuardian(GuardianDAO guardianDAO){
//        service.addGuardian(guardianDAO);
//    }
//}
