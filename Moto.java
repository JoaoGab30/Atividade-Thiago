class Moto implements Veiculoo {
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }

    public void descer() {
        System.out.println("Descendo da moto.");
    }
}
