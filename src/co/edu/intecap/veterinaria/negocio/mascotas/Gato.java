package co.edu.intecap.veterinaria.negocio.mascotas;

import co.edu.intecap.veterinaria.negocio.Animal;
import co.edu.intecap.veterinaria.negocio.Mascota;

public class Gato extends Mascota implements Animal {

    private boolean pelo;
    private boolean garras;

    @Override
    public void comer(double comida) {
        this.setPeso(this.getPeso() + (comida * (0.05) / 3));
        this.setEnergia(this.getEnergia() + Math.round((30 / 3) * 2));
        this.validarEnergia();
    }

    @Override
    public void defecar() {
        System.out.println("Ya fui al baño, recoge mi regalito");
        this.setPeso(this.getPeso() * Math.round((0.03 / 3) * 2));
    }

    @Override
    public void beber(double bebida) {
        this.setPeso(this.getPeso() + Math.round(bebida * (0.01 / 3) * 2));
    }

    @Override
    public void jugar() {
        super.jugar();
        this.setPeso(this.getPeso() / Math.round((0.15 / 3) * 2));
    }

    public void maullar() {
        System.out.println("Miau... Miau... Miau...");
    }

    public void lamer() {
        System.out.println("Te estoy lamiendo humano, dame amor");
        this.setEnergia(this.getEnergia() - Math.round((20 / 3) * 2));
        this.validarEnergia();
    }

    public void arañar() {
        System.out.println("He mordido a mi dueño se va a enojar conmigo Y ESO NO ME IMPORTA");
        this.validarEnergia();
    }

    /**
     * @return the pelo
     */
    public boolean isPelo() {
        return pelo;
    }

    /**
     * @param pelo the pelo to set
     */
    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    /**
     * @return the garras
     */
    public boolean isGarras() {
        return garras;
    }

    /**
     * @param garras the garras to set
     */
    public void setGarras(boolean garras) {
        this.garras = garras;
    }

}
