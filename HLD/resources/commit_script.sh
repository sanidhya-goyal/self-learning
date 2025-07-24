#!/bin/bash

i=0
FILES=(
"31.DualWritePattern.md"
"29.DivideMicroserviceToMonolithic.md"
"27.ServiceMesh.md"
"26.APIGateway.md"
"25.ThunderingHerd.md"
"24.JWT.md"
"23.Encryption.md"
"22.TwoPhaseLocking.md"
"22.OAuth2.0.md"
"21.DistributedConcurrencyControl.md"
"20.DatabaseIndexing.md"
"19.HandlingDistributedTansactionsPart1AndPart2.md"
"18.DistributedCachingPart1AndPart2.md"
"17.LoadBalancerAndDifferentAlgorithms.md"
"16.ProxyVSReverseProxy.md"
"15.DistributedMessagingQueueKafkaRabbitMQ.md"
"14.DesignHighAvailabilitySystem.md"
"13.DesignIdempotentPOSTAPI.md"
"12.DesignRateLimiter.md"
"11.WhatsappSystemDesign.md"
"10.SQLvsNoSQL.md"
"9.DesignAKeyValueStore.md"
"8.BackOfTheEnvelopeEstimation.md"
"7.DesignUrlShorteningService.md"
"6.ConsistentHashing.md"
"5.ScaleFromZeroToMillionUsers.md"
"4.MicroserviceDesignPatternPart2.md"
"3.MicroserviceDesignPatternPart1.md"
"2.CAPTheorem.md"
"1.NetworkProtocols.md"
)

for file in "${FILES[@]}"; do
    if [ -f "$file" ]; then
        # macOS-compatible date: subtract $i days
        commit_date=$(date -v -"$i"d +"%a, %d %b %Y %H:%M:%S %z")
        
        git add "$file"
        GIT_COMMITTER_DATE="$commit_date" git commit --date="$commit_date" -m "$file"
    else
        echo "❌ File not found: $file"
    fi
    ((i++))
done
