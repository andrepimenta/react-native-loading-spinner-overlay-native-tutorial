//
//  BridgeTemplate.m
//  ReactNativeLoadingSpinnerOverlayNative
//
//  Created by Andre Pimenta on 11/07/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "React/RCTLog.h"
#import "LoadingOverlay.h" // Here put the name of your module

@implementation LoadingOverlay // Here put the name of your module

// This RCT (React) "macro" exposes the current module to JavaScript
RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(toggle:(BOOL *)show
                 resolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
  dispatch_async(dispatch_get_main_queue(), ^{
    
    @try{ 
      resolve(@{ @"key": [NSNumber numberWithBool:1] });
    }
    @catch(NSException *exception){
      reject(@"get_error",exception.reason, nil);
    }
  });
}

@end