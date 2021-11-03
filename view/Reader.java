package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public void ler(){
        try {
            // entrada do arquivo
            FileInputStream entrada = new FileInputStream("dados/arquivosaida.txt");
            // leitor do stream
            InputStreamReader reader = new InputStreamReader(entrada);
            // buffer de leitura
            BufferedReader leitor = new BufferedReader(reader);
    
            // impressao do conteúdo
            String linha="";
            boolean ler = true;
            while(ler){
                // a linha recebe uma linha do buffer de leitura
                linha = leitor.readLine();
                if (linha != null) {
                    System.out.println(linha);
                //caso a linha esteja em branco, sai do loop
                } else{
                    ler = false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e){
            System.out.println("Não foi possível ler o arquivo especificado");
        }
      }
}
