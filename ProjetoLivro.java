/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author ADMIN
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
    
        p[0]=new Pessoa ("Pedro", 22, "M");
        p[1]=new Pessoa ("Maria",25,"F");
        
        l[0]=new Livro("aprendendo java "," josé da silva ",300,p[0]);
        l[1]=new Livro(" poo para iniciantes ","josé da silva",500,p[1]);
        l[2]=new Livro(" java avançado "," Maria Candido ",800,p[0]);
        
        l[0].abrir();
        l[0].folhear(400);
        System.out.println(l[0].detalhes());
    }
}
