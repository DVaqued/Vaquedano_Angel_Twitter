/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.Date;

/**
 *
 * @author angel
 */
public class inicioTwitter {

    inicioTwitter tweets[] = new inicioTwitter[200];
    String username, tweet;
    Date fecha = new Date();

    public inicioTwitter() {
        
    }

    public inicioTwitter(String username, String tweet) {
        this.username = username;
        this.tweet = tweet;
        this.fecha = new Date();
    }
    public inicioTwitter[] getTweets(){
        return tweets;
    }
    public boolean publicar(String username, String tweet){
        username=usuario.usuarioSesion;
        for (int index = tweets.length-1; index > 0; index--) {
            if (tweets[index]==null) {
                tweets[index]=new inicioTwitter(username,tweet);
                return true;
            }
        }
        return false;
    }
    public String mensajeTweet(){
        String tweetA="@"+username +": "+tweet+" "+fecha.toString() ;
        return tweet;
    }
}
