package view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer {
    public void escrever(Object obj){
        try {
            // caminho de saída do arquivo
            FileOutputStream saida = new FileOutputStream("dados/arquivosaida.txt");
            // escritor do stream
            OutputStreamWriter writer = new OutputStreamWriter(saida);
            // buffer de escrita
            BufferedWriter escritor = new BufferedWriter(writer);
            System.out.println(obj.toString());
            escritor.append(obj.toString());
            //fazendo a quebra de linha
            escritor.newLine();
            escritor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível encontrar a pasta especificada");
        } catch (IOException e){
            System.out.println("Não foi possível escrever o arquivo especificado");
        }
    }
}
