package j11_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
    public static void main(String[] args) {
        //Array declaration
        int a;//declaration edilen fakat atama yapılmayan bir variable tanımlandı
        int arr[];//declara edilen fakat atama yapılmauyan bir non primitive int type array tanımlandı
        // Tanımlanan ancak değer atanmayan bir array hiçbir aksiyona tabi tutulamaz. Yoksa cte hatası alırız
        String[] isimler = {"saim", "halid", "safvet", "abdurrahman", "Yücel", "sema"};//hem atama hem declaration yapıldı.
        int sayiArr[] = new int[5];//eleman sayısı tanımlanmış boş int type array
        int sayiArr1[] = new int[7];//eleman sayısı tanımlanmış boş int type array
        //arraya eleman girişi->update
        sayiArr[3]=61;//3. index eleman 61 olarak update edildi.
        sayiArr[4]=58;//4. index eleman 58 olarak update edildi.
        sayiArr[0] =55;
        sayiArr[3] =58;//3. index eleman 61 iken 58 olarak deiştirildi, array elemanları unique olmak zorunda değildir.
        //Arrayin eleman sayisi-> length
        System.out.println(sayiArr.length);
        System.out.println("isimler.length = " + isimler.length);
        //Arrayin elemanlarını yazdırma
        System.out.println("isimler = " + isimler);
        System.out.println("sayiArr = " + sayiArr);
        //sout(arr) ARRAY non primitive olduğu için bu şekilde print etme bize referans değeri verir
        //sout(Arrays.toString(arr)) bu şekilde elemanları verir
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(sayiArr1) = " + Arrays.toString(sayiArr1));
        //Arrayın son index elemanını print etme
        System.out.println("Son index elemanı : "+sayiArr[sayiArr.length-1]);
        //Arrayın ilk index elemanını print etme
        System.out.println("İlk index elemanı : "+sayiArr[0]);
        //Arrayda olmayan index elemanı yazdırma
        //System.out.println(sayiArr[42]);RTE hatası

        //Arrayın elemanlarını print etme-> bad practice
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]+" ");
        }
        System.out.println();
        //Arrayı doğal sıralama alfabetik veya küçükten büyüğe
        System.out.println("Sort öncesi isimler arr:"+Arrays.toString(isimler));
        Arrays.sort(isimler);
        System.out.println("Sort sonrası isimler arr:"+Arrays.toString(isimler));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        Arrays.sort(sayiArr);
        Arrays.toString(sayiArr);


    }
}
