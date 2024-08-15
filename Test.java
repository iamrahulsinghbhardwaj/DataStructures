class Test{
    public static void main(String[] args){
      int arr[]= new int[]{7,1,5,3,6,4};
      System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int maxProfit=0;
        int lowestStockPrice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowestStockPrice){
                lowestStockPrice=prices[i];
            }
            maxProfit=prices[i]-lowestStockPrice;
          
        }

        return maxProfit;
    }
}