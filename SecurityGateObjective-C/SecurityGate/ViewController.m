//
//  ViewController.m
//  SecurityGate
//
//  Created by Ivan Almada on 8/15/19.
//  Copyright © 2019 Ivan. All rights reserved.
//

#import "ViewController.h"
#import "SecurityGate.h"
#import "SecurityManager.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    SecurityGate *gate = [[SecurityGate alloc] init];
    
    SecurityManager *manager = [[SecurityManager alloc] initWithGate:gate];
    
    gate.open = YES;
    gate.open = NO;
    gate.open = YES;
    gate.open = NO;
    gate.open = NO;
    
}

@end
