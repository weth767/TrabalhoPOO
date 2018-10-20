/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import modelo.Partido;
import java.util.ArrayList;
import modelo.Eleitor;


/**
 *
 * @author João Paulo e Leandro
 */
public class PartidoDao {
    private ArrayList<Partido> partidos;//Arraylist do tipo partido

    public PartidoDao() {//contrutor da classe
        partidos = new ArrayList();//instacia o arraylist para que partidos possam ser inseridos
    }
    /** 
     * @param Partido Um objeto do tipo partido, para ser inserido no arraylist.
     * @return void.
    */
    public void cadastraPartido(Partido partido){
        this.partidos.add(partido);
    }
    /** 
     * @param Partido Um objeto do tipo partido, para ser removido do arraylist.
     * @return void.
    */
    public void removePartido(Partido partido){
        for (Partido p : partidos) {//varre o arraylist
            if(p.getNumero() == partido.getNumero()){//verifica o numero do partido
                partidos.remove(p);//caso encontre o numero remove o partido
            }
        }
    }
    /** 
     * @return ArrayList<Partido> um array contendo todos o partidos cadastrados.
    */
    public ArrayList<Partido> retornaPartidos(){
        return this.partidos;
    }
    /** 
     * @param String Uma String contendo o nome do partido a ser procurado no array.
     * @return Partido.
    */
    public Partido retornaPartido(String nome){
        for (Partido partido : partidos) {//varre o arraylist
            if(partido.getNome().equals(nome)){//caso encontre o nome do partido
                return partido;//retorna o mesmo
            }
        }
        return null;//retorna NULL caso nao encontre o partido
    }
    /** 
     * @param ArrayList<Partido> Um arraylist do tipo Partido, para ser atribuido no arraylist da classse.
     * @return void.
    */
    public void appendArrayList(ArrayList<Partido> partidos){
        for (Partido partido : partidos) {
            this.partidos.add(partido);
        }
    }
}
