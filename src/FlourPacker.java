public class FlourPacker {

    public static void main ( String []args){
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(0,5,4));

    }

    public static boolean canPack( int bigCount, int smallCount,  int goal ){

        int realBigCount = bigCount*5; // stores the actual weight of bigCount
        int realSmallCount = smallCount*1;// stores the actual weight of smallCount

        if ( bigCount<0 || smallCount<0 || goal< 0){
            return false;
        }
        else if ( ( realBigCount+smallCount)== goal ){
            return true;

        }
        else if ( (realBigCount+realSmallCount)> goal ){

            for ( int iBigCount = 0;iBigCount<=bigCount; iBigCount++){

                for( int iSmallCount =0; iSmallCount<=realSmallCount; iSmallCount++){

                    if ( (iBigCount*5 )+ iSmallCount == goal){
                        return true;
                    }
                }
            }
        } return false;
        }
    }

