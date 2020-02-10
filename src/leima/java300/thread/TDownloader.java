package leima.java300.thread;


//学习git，第一次修改后再次push

public class TDownloader extends Thread {
    private String url;
    private String name;

    public TDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader wd=new WebDownloader();
        wd.download(url,name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        TDownloader td1=new TDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=false&word=%E5%A3%81%E7%BA%B8&step_word=&hs=0&pn=2&spn=0&di=31460&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=104412215%2C2753702561&os=611182387%2C1277642884&simid=3421607797%2C77670789&adpicid=0&lpn=0&ln=3642&fr=&fmq=1567133149621_R&fm=&ic=0&s=undefined&hd=0&latest=0&copyright=0&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=wallpaper&bdtype=0&oriquery=&objurl=http%3A%2F%2Ff.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fb58f8c5494eef01ff772eac9e1fe9925bc317d5c.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fr5oj6_z%26e3Bkwt17_z%26e3Bv54AzdH3Fq7jfpt5gAzdH3Fcnnlm9b88_z%26e3Bip4s%3Fqks%3D6jswpj_q7jfpt5g_n&gsm=1&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","11.jpg");
        TDownloader td2=new TDownloader("http://image.baidu.com/search/detail?z=0&word=%E6%91%84%E5%BD%B1%E5%B8%88%E6%9D%B0%E5%A4%AB%E4%BD%9C%E5%93%81&hs=0&pn=3&spn=0&di=0&pi=5139273732223422616&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cs=1808288369%2C2886187605&os=&simid=&adpicid=0&lpn=0&fm=&sme=&cg=&bdtype=-1&oriquery=&objurl=http%3A%2F%2Ft8.baidu.com%2Fit%2Fu%3D1484500186%2C1503043093%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D1280%26h%3D853&fromurl=&gsm=40000000004&catename=pcindexhot&islist=&querylist=","22.jpg");
        TDownloader td3=new TDownloader("http://image.baidu.com/search/detail?z=0&word=%E6%91%84%E5%BD%B1%E5%B8%88%E8%8A%A6%E7%82%B3%E8%87%A3&hs=0&pn=4&spn=0&di=0&pi=1096592873828195119&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cs=4144687355%2C1909913594&os=&simid=&adpicid=0&lpn=0&fm=&sme=&cg=&bdtype=-1&oriquery=&objurl=http%3A%2F%2Ft8.baidu.com%2Fit%2Fu%3D2247852322%2C986532796%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D1280%26h%3D853&fromurl=&gsm=40000000004&catename=pcindexhot&islist=&querylist=","33.jpg");
        td1.start();
        td2.start();
        td3.start();
    }
}
