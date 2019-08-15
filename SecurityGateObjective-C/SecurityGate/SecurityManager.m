//
//  SecurityManager.m
//  SecurityGate
//
//  Created by Ivan Almada on 8/15/19.
//  Copyright © 2019 Ivan. All rights reserved.
//

#import "SecurityManager.h"

@implementation SecurityManager

- (instancetype)initWithGate:(SecurityGate *)gate {
    
    if ( (self = [super init] ) != nil ) {
        self.gate = gate;
        [gate addObserver:self forKeyPath:@"open" options:0 context:NULL];
    }
    
    return self;
}

- (void)observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary<NSKeyValueChangeKey,id> *)change context:(void *)context {
    
    if (object == self.gate) {
        NSLog(@"Security Gate Changed!");
    }
    
}

@end
