public class VideoGame{
    String nome, marca;
    float costo;
    int anno;

    public VideoGame(String nome, String marca, float costo, int anno){
       this.nome=nome;
       this.marca=marca;
       this.costo=costo;
       this.anno=anno;
    }

    public String toString(){
        return "Nome: "+nome+" Marca: "+marca+" Costo: "+costo+" Anno: "+anno;
    }


}