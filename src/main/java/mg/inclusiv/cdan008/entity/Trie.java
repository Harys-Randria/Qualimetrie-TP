package mg.inclusiv.cdan008.entity;

public class Trie {
    
    private int[] numbers;

    public Trie(int[] numbers) {
        this.numbers = numbers;
      }


      //fonction pour trier par ordre croissante un tableau de nombre entier
      public void AscTrie() {
        for (int i = 1; i < numbers.length; i++) {
          int elementCurrent = numbers[i];
          int j = i - 1;
          while (j >= 0 && numbers[j] > elementCurrent) {
            numbers[j + 1] = numbers[j];
            j--;
          }
          numbers[j + 1] = elementCurrent;
        }
      }
      
      //fonction pour afficher un tableau
      public void showNumbers() {
        for (int number : numbers) {
          System.out.print(number + " ");
        }
        System.out.println();
      }

}
