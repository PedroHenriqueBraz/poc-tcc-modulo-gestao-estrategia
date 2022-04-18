package com.gls.gestaoestrategia.worker;

import com.gls.gestaoestrategia.httpclient.mic.MICClient;
import com.gls.gestaoestrategia.httpclient.msc.MSCClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class HealthWorker {
    @Autowired
    private MICClient micClient;
    @Autowired
    private MSCClient mscClient;

    @Scheduled(fixedRate = 100000)
    public void healthCheck(){
        System.out.println("mic ping");
        micClient.health();

        System.out.println("msc ping");
        mscClient.health();
    }
}
