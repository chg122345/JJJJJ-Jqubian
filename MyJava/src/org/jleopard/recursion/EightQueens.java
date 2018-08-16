package org.jleopard.recursion;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-15  下午8:59
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 *
 * 八皇后算法
 */
public class EightQueens {

    static int count = 1;

  public static void show(int[][] map){
        System.out.println("第" + count + "种放法");
        for (int i = 0; i < 8; i ++){
            for (int j = 0; j < 8; j ++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        count ++;
    }

    /**
     * 验证是否可以放皇后
     *
     * 从上至下的顺序验证
     * @param row
     * @param col
     * @return
     */
    private static boolean check(int[][] map, int row, int col){
        //1.验证上面是否有皇后
        for (int i = row -1; i >= 0;i --){
            if (map[i][col] == 1){
                return false;
            }
        }

        //2.验证左斜上方是否有皇后
        // 行减小 列减小
        for (int i = row -1, j = col -1; i >= 0 && j >=0 ;i --,j--){
            if (map[i][j] == 1){
                return false;
            }
        }

        //3.验证右斜上方是否有皇后
        // 行减小 列增加
        for (int i = row -1, j = col +1; i >= 0 && j < 8 ;i --,j ++){
            if (map[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    /**
     * 摆放八皇后
     * @param map 二维数组
     * @param row 从多少行开始摆放
     */
    public static void play(int[][] map, int row){

        for (int i = 0; i < 8; i++){
            if (check(map,row,i)){
                map[row][i] = 1;  // 放置皇后
                if (row == 7){
                   show(map);  //放完最后一行 展示
                }else {
                    play(map,row + 1); // 继续下一种放法
                }
            }
            map[row][i] = 0; //不能放皇后 或者 一种放法完成 向上一行继续调整皇后位置 继续放
        }
    }

    public static void main(String[] args) {
         int[][] map = new int [8][8];
        play(map,0);
    }
}
