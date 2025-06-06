import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 앙상블할래 {
    static int n, m;
    static int[][] arr;
    static int[] result;
    static double bestSingleModel = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        result = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 1. 단일 모델중 정확도가 높은것 구하기
        for (int i = 0; i < n; i++) {
            bestSingleModel = Math.max(bestSingleModel, getCorrect(arr[i]));
        }

        // 2. 모든 홀수개의 조합 시행
        List<Integer> selectedModels = new ArrayList<>();
        if (findEnsemble(0, selectedModels)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    private static boolean findEnsemble(int start, List<Integer> selectedModels){
        if (selectedModels.size() > 0 && selectedModels.size() % 2 == 1) {
            if (evaluateEnsemble(selectedModels)) {
                return true;
            }
        }
        if (start == n) return false;

        // 현재 모델을 선택하는 경우
        for (int i = start; i < n; i++) {
            selectedModels.add(i);
            if (findEnsemble(i + 1, selectedModels)) {
                return true;
            }
            selectedModels.remove(selectedModels.size() - 1);
        }
        return false;
    }
    
    private static boolean evaluateEnsemble(List<Integer> selectModels){
        int[] ensemblePrediction = new int[m];
        for ( int i = 0; i < m; i++){
            int countZero = 0, countOne = 0;
            for(int model : selectModels){
                if (arr[model][i] == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
            }
            if(countOne > countZero){
                ensemblePrediction[i] = 1;
            }else{
                ensemblePrediction[i] = 0; 
            }
        }
        return getCorrect(ensemblePrediction) > bestSingleModel;
    }

    private static double getCorrect(int[] arr) {
        int correct = 0;
        for (int i = 0; i < m; i++) {
            if (arr[i] == result[i])
                correct++;
        }
        return (double) correct / m;
    }

}
