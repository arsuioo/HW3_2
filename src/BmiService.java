public class BmiService {
        public int calculate(int weight, int height) {
            int bmi = (weight/(height*height));
            return bmi;
    }
}
