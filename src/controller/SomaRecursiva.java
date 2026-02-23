public class SomaRecursiva {

    // Construtor padrão
    public SomaRecursiva() {
        // Apenas cria a instância da classe
    }

    // Método recursivo para adicionar dois números naturais
    public int somar(int x, int y) {

        /*
         * CASO BASE:
         * Quando y for igual a zero,
         * significa que o processo terminou.
         */
        if (y == 0) {
            return x;
        }

        /*
         * PASSO RECURSIVO:
         * Incrementa x e decrementa y
         * até que y chegue a zero.
         */
        return somar(x + 1, y - 1);
    }
}