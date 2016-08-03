package bill.zts.com.bill.http;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/8/2.
 */
public class RetrofitApi {

    private static ApiInterface apiService = null;
    private static Retrofit retrofit;
    static {
          retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public static Object getApiService(Class clas){
       return retrofit.create(clas);
    }


}
