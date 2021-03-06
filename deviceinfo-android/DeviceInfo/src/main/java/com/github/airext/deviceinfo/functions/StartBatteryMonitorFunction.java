package com.github.airext.deviceinfo.functions;

import android.app.Activity;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.github.airext.deviceinfo.providers.DeviceInfoBattery;

/**
 * Created by Max Rozdobudko on 6/15/15.
 */
public class StartBatteryMonitorFunction implements FREFunction
{
    @Override
    public FREObject call(FREContext freContext, FREObject[] freObjects)
    {
        DeviceInfoBattery.startMonitoring(freContext.getActivity());

        return null;
    }
}
