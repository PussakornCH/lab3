

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int temp;
    for(int i = 0; i < arr.length/2; i += 1) { // input = 1,2,3
      temp = arr[arr.length -i - 1]; // 3        
      arr[arr.length -i - 1] = arr[i];  //     1    // It swich again and make everything the same
      arr[i] = temp;                 // 3    
      //temp = arr[i];

    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) { // 123 // 32
      newArray[i] = arr[arr.length - i - 1];
      String.format("The new[i] is %d", newArray[i]);
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    int count = 0;
    if(arr.length < 2) 
      { return 0.0; }

    double lowest = arr[0];
    for(double num: arr) { // How this for work
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num == lowest && count == 0)
      {
        count += 1;
      }
      else {
        sum += num;
      }
    }
    return sum / (arr.length - 1);
  }


}

