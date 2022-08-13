package br.ulbra.classes;

import br.ulbra.classes.Animal;
import br.ulbra.view.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {

    public ArrayList<Animal> lista = new ArrayList();

    public void cadastrar(Animal p) {
        lista.add(p);
        System.out.println("o" + p.getNomePet() + "foi cadastrado com sucesso!");

    }

    

    public String listarAnimal() {
        String resultado = "Lista de pets \n";
        System.out.println("~~~~~~~~~~~~~~");

        if (lista.isEmpty()) {
            resultado = "A sua agenda está vazia";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                resultado += "Nome: " +lista.get(i).getNomePet() + " - "
                        +"\nEspecie: " + lista.get(i).getEspecie() + " - "
                        +"\nIdade: " + lista.get(i).getIdade() +     " - "
                        +"\nCódigo: " + lista.get(i).getCod()
                        + "\n";
            }

        }
        return resultado;
    }
    public int encontrarAnimal(String nome){
        int aux = -1;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNomePet().equals(nome))
            { aux = i; }
            
        }
        return aux;
    }
    public void excluir (int i){
        lista.remove(i);
    }
    
    public int encontrarDono(String nome){
        int aux = -1;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNomeDono().equals(nome))
            { aux = i; }
    }
        return aux;
}
     public String listarDono() {
        String listaDono = "Donos \n";
        System.out.println("~~~~~~~~~~~~~~");

        if (lista.isEmpty()) {
            listaDono = "A sua agenda está vazia";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                listaDono+= "Nome: " +lista.get(i).getNomeDono() + " - "
                        +"Sobrenome: " + lista.get(i).getSobrenome() + " - "
                        +"RG: " + lista.get(i).getRG() +     " - "
                        +"CPF: " + lista.get(i).getCpf() +   " - "
                        +"Email: " + lista.get(i).getEmail() 
                        + "\n";
            }

        }
        return listaDono;
  

     }
     public String listarPet(int i){
         String resultado = "Nome: " +lista.get(i).getNomePet() + " - "
                        +"Especie: " + lista.get(i).getEspecie() + " - "
                        +"Idade: " + lista.get(i).getIdade() +     " - "
                        +"Código: " + lista.get(i).getCod()
                        + "\n";
          
          return resultado;
          
     }
   public String listarDono(int i){
       String listaDono = "Nome: " +lista.get(i).getNomeDono() + " - "
                        +"\nSobrenome: " + lista.get(i).getSobrenome() + " - "
                        +"\nRG: " + lista.get(i).getRG() +     " - "
                        +"\nCPF: " + lista.get(i).getCpf() +   " - "
                        +"\nEmail: " + lista.get(i).getEmail() 
                        + "\n";
        return listaDono;
   }
    public String listarRelacoes(int i){
         String resultado = "Nome: " +lista.get(i).getNomePet() + " - "
                        +"\nEspecie: " + lista.get(i).getEspecie() + " - "
                        +"\nIdade: " + lista.get(i).getIdade() +     " - "
                        +"\nCódigo do pet : " + lista.get(i).getCod()
                     
                        +"\nNome: " +lista.get(i).getNomeDono() + " - "
                        +"\nSobrenome: " + lista.get(i).getSobrenome() + " - "
                        +"\nRG: " + lista.get(i).getRG() +     " - "
                        +"\nCPF: " + lista.get(i).getCpf() +   " - "
                        +"\nEmail: " + lista.get(i).getEmail() 
                        +"\nCódigo do dono: "
                        + "\n";
          
          return resultado;
}
    public void Tamanho(){
        System.out.println("Há: " + lista.size() + "animais cadastros no sistema");
    }
}
