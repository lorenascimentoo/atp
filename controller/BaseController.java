package controller;

import java.util.ArrayList;

public abstract class BaseController<T> {
    private ArrayList<T> dados;

    public BaseController(){
        this.dados = new ArrayList<T>();
    }

    //METODOS CRUD

    //CREATE
    public void adicionar(T obj){
        if (!existe(obj)) {
            this.dados.add(obj);    
        }
    }

    //READ
    public ArrayList<T> listar(){
        return this.dados;
    }

    //UPDATE
    public void atualizar(T obj){
        if(existe(obj)){
            this.dados.remove(obj);
            this.dados.add(obj);
        }
    }

    //DELETE
    public void excluir(T obj){
        this.dados.remove(obj);
    }

    public boolean existe(T obj){
        return this.dados.contains(obj);
    }
}
